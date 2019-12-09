package com.CollegeRegistration.utility;

import java.sql.*;

import com.CollegeRegistration.exceptions.UtilityException;

public class DbConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/college";
	private static final String USER = "root";
	private static final String PASS = "Welcome123";

public static Connection getConnection() throws UtilityException
{
	Connection con=null;
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(URL,USER,PASS);
		System.out.println("connected to database successfully");

	}
	catch (ClassNotFoundException e) {
		throw new UtilityException("class not found exception",e);
	} catch (SQLException e) {
		throw new UtilityException("no connection to database made",e);
	}
	return con;
	
}
public static String closeConnection(Connection con) throws UtilityException
{
	String res="";
	try {
		if(con!=null)
		{
			con.close();
		}
	}
	catch(SQLException e)
	{
		throw new UtilityException(e);
	}
	return res;
}
}
