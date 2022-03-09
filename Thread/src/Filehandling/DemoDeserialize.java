package Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e = null;
		try
		{
			FileInputStream filein = new FileInputStream("D:/MyEmploye.ser");
			ObjectInputStream in = new  ObjectInputStream(filein);
			e=(Employe)in.readObject();
			in.close();
			filein.close();
			
			
		}catch(ClassNotFoundException | IOException i)
		{
			
			System.out.println("employe class not found");
			return;
		}
		System.out.println("deserialized employe..");
		System.out.println("name:"+e.getName());
		System.out.println("id:"+e.getId());
	}

}
