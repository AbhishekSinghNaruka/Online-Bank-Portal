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
			System.out.println("inserting records");
			stmt=con.prepareStatement("insert into customer (name,userName,loginPass,pin) values(?,?,?,?)");
			stmt.setString(1, customer.getName());
			stmt.setString(2,customer.getUname());
			stmt.setString(3, customer.getLoginPass());
			stmt.setInt(4, customer.acc.getTransictionPassword());
			stmt.executeUpdate();
			System.out.println("inserted records.");
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
			if(con!=null)
				try {
					con.close();
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
//			if(con!=null)
//				try {
//					con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
		}
		return customer;
		
	}
}
