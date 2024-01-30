package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.CallableStatement;

public class ProceduresDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3305/p9batch","root","admin");
    	System.out.println("connected");
    	// caling store procedure
    	CallableStatement cst=c.prepareCall("{call showData(?,?)}");
    	 
    	cst.setInt(1,105);
    	 
    	 cst.registerOutParameter(2,Types.VARCHAR);
     	    	 
    	   	 
    	 cst.execute();
    	 
    	System.out.println(cst.getString("empname"));
    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	
    	
    	
    	
    	
    	
    	


    	
	}

}
