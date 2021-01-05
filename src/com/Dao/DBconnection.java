package com.Dao;
import java.sql.*;


public class DBconnection {
	public static Connection con=null;
	static {
	try {
		System.out.println("Connecting Database");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Portal","root","dark");
		System.out.println("Database Connected");
	}
	catch(SQLException | ClassNotFoundException e){
		e.printStackTrace();
	}
	}
	public static Connection getCon() {
		return con;
	}
}
