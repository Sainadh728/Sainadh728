package com.tns.jdbccrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingStatement {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Sainadh@123";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/sainadh";

	private static Connection con=null;
	
	static
	{
		try
		{	
    Class.forName(DB_DRIVER_CLASS);
	con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
	}

	catch(ClassNotFoundException | SQLException e) 
		{
	e.printStackTrace();	
}
}
	public static Connection getConnectionObject()
	{
		return con;
	}
		
}
