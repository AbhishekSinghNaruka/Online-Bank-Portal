package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.*;
public class CustomerDao {
	
	public void addCustomer(Customer customer) {
		Connection con=DBconnection.getCon();
		PreparedStatement stmt=null;
		try {
			stmt=con.prepareStatement("insert into customer (name,userName,loginPass,pin) values(?,?,?,?)");
			stmt.setString(1, customer.getName());
			stmt.setString(2,customer.getUname());
			stmt.setString(3, customer.getLoginPass());
			stmt.setInt(4, customer.acc.getTransictionPassword());
			stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	public Customer checkLogin(String uname,String pass) {
		Customer customer=null;
		Connection con=DBconnection.getCon();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt=con.prepareStatement("select * from customer where userName= ? "+"and loginPass=?");
			stmt.setString(1, uname);
			stmt.setString(2,pass);
			rs=stmt.executeQuery();
			if(rs.next()) {
				customer=new Customer();
				customer.setName(rs.getString("name"));
				customer.setUname(uname);
				customer.setLoginPass(pass);
				customer.acc.setBalance(rs.getFloat("balance"));
				customer.acc.setID(rs.getInt("ID"));
				customer.acc.setTransictionPassword(rs.getInt("pin"));
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return customer;
		
	}
	public void changeBalance(float balance,int ID) {
		Connection con=DBconnection.getCon();
		PreparedStatement stmt=null;
		try {
			stmt=con.prepareStatement("update customer set balance=? "+ "where id=?");
			stmt.setFloat(1, balance);
			stmt.setInt(2, ID);
			stmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public float getBalance(int ID) {
		Connection con=DBconnection.getCon();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt=con.prepareStatement("select balance from customer where ID=?");
			stmt.setInt(1,ID);
			rs=stmt.executeQuery();
			if(rs.next()) {
				return rs.getFloat("balance");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return (float) (0.0);
	}
	public void update(Customer customer) {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DBconnection.getCon();
			stmt=con.prepareStatement("update customer set name=?, loginPass=?, userName=? "+"where ID=?");
			stmt.setString(1,customer.getName());
			stmt.setString(2,customer.getLoginPass());
			stmt.setString(3,customer.getUname());
			stmt.setInt(4,customer.acc.getId());
			stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	public void delete(int ID) {
		Connection con=DBconnection.getCon();
		PreparedStatement stmt=null;
		try {
			con=DBconnection.getCon();
			stmt=con.prepareStatement("delete from customer where ID=?");
			stmt.setInt(1,ID);
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	public boolean checkUniqueUserName(String userName) {
		Connection con =null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			con=DBconnection.getCon();
			stmt=con.prepareStatement("select ID from customer where userName=?");
			stmt.setString(1, userName);
			rs=stmt.executeQuery();
			if(rs.next())
				return false;
			else
				return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return false;
	}
	public int getID(String userName) {
		Connection con =null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			con=DBconnection.getCon();
			stmt=con.prepareStatement("select ID from customer where userName=?");
			stmt.setString(1, userName);
			rs=stmt.executeQuery();
			if(rs.next())
				return rs.getInt("ID");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return 0;
	}
}