package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Mainclass {
	
	static Scanner sn;
	
	static InputStreamReader r;
	static BufferedReader brr;
	static DBsample obj;

	public static void main(String[] args) throws IOException, SQLException {
		
		r=new InputStreamReader(System.in);
		brr=new BufferedReader(r);
		obj = new DBsample();
		sn = new Scanner(System.in);
		
		System.out.println("your choices::");
		
		System.out.println("1. Registrayion");
		System.out.println("2. Login");
		System.out.println("3. Change password");
		System.out.println("4. De-activate account");
		System.out.println("5. Exit");
		
		int choice =0;
		
		do {
			System.out.println("please enter ::");
			choice = sn.nextInt();
			switch (choice) {
			case 1:
				register();
				break;
			
			case 2:
				Login();
				break;
				
			case 3:
				//changepass();
				break;
				
			default:
				break;
			}
    	}while(choice!=4);
		System.out.println("Thanks for use");
		
	}


	private static void register() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter rollno:");
		int rollno=Integer.parseInt(brr.readLine());
		System.out.println("enter name:");
		String name = brr.readLine();
		System.out.println("enter contact:");
		String contact = brr.readLine();
		System.out.println("enter email:");
		String email = brr.readLine();
		System.out.println("enter pass:");
		String pass = brr.readLine();
		obj.insert(rollno, name, contact, email, pass);
	
	}
private static void Login() throws IOException, SQLException {
	System.out.println("enter email:");
	String email = brr.readLine();
	System.out.println("enter pass::");
	String pass = brr.readLine();
	obj.select(email,pass);
}
}

