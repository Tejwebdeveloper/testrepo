package Db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnection {
	static Connection con=null;

	public static Connection db() {
		try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     
			 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db_new","root","root");
			 
			
		}catch(Exception e)
		{
			System.out.print(e);
		}
		return con;
	}

}
