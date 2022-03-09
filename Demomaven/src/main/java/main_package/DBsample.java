package main_package;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db_connections.JDBC_Connection;

public class DBsample {
	
	Connection con;
	
	public DBsample() {
		
		con =JDBC_Connection.db();
	}
void insert (int id,String name,int contact) {
	try {
		PreparedStatement pd = con.prepareStatement("insert into student2(id,name,contact)" +"values(?,?,?)"); 
		
	
	    pd.setInt(1, id);
		pd.setString(2,name);
		pd.setInt(3, contact);
		int i=pd.executeUpdate();
		
		if(i>0)  {
			System.out.println("successfully inserted");
			}
	}catch (Exception e) {
		System.out.println(e);
	}
		}
}

