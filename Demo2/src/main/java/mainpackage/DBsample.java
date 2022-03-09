package mainpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Db_connection.JDBCconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DBsample {
	Connection con;
	static DBsample obj;
	static InputStreamReader r;
	static BufferedReader brr;
	
	public DBsample()
	{
		con=JDBCconnection.db();
	}
    void insert(int id,String name,String contact,String email,String pass)
    {
    try {
    	PreparedStatement pd =con.prepareStatement("insert into employe1 (id,name,contact,email,pass)" 
    			+ "values(?,?,?,?,?)");
    	pd.setInt(1, id);
    	pd.setString(2, name);
    	pd.setString(3, contact);
    	pd.setString(4, email);
    	pd.setString(5, pass);
    	
    	int i=pd.executeUpdate();
    	
    	if (i>0) {
    		System.out.println("successfully inserted");
    	}
    }catch (Exception e) {
    	System.out.println(e);
    }
    }


void select(int id) {
	try {
		PreparedStatement pd = con.prepareStatement("select * from employe1 where id = '"+ id +"' ");
		ResultSet rs = pd.executeQuery();
		System.out.println(rs);
		while(rs.next())
		{
			int idd = rs.getInt(1);
			String name = rs.getString(2);
			String contact = rs.getString(3);
			System.out.println("values are::" + name +"----"+contact);
		}
				
	}catch (Exception e) {
		
	}
}
public void select(String email, String pass) throws SQLException {
	PreparedStatement pd = con.prepareStatement("select * from employe1 where email = '" + email +"' ");
	ResultSet rs = pd.executeQuery();
	
	while (rs.next()) {
		int id = rs.getInt("id");
		String name =  rs.getString("name");
		
		System.out.println("welcome : "+name);
	}
}

public void update(int id, String des) {
	try {
		PreparedStatement pd =  con.prepareStatement("update course set description='" + des + "' " + "where id='" + id +"' ");
		int i = pd.executeUpdate();
		
		if(i > 0) {
			System.out.println("successful");
		}else {
			System.out.println("check with ypur query");
		}
	}catch (Exception e) {
		System.out.println(e);
	}
}

}

