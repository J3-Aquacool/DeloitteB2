package com.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	
    	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3305/p9batch","root","admin");
    	System.out.println("connected");
    	
    	c.setAutoCommit(false);
    	
    PreparedStatement pst=	c.prepareStatement("insert into dummy values(?,?)");
    
    	
    	
    	pst.setInt(1, 106);
    	pst.setString(2,"Shivansh");
    	
    pst.executeUpdate();
    
    	
    
	pst.setInt(1, 107);
	pst.setString(2,"Balu");
	
pst.executeUpdate();
c.rollback();
c.commit();

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	


    }
}
