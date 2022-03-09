package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demoserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe e = new Employe(1,"teju");
		try {
			FileOutputStream fileout = new FileOutputStream("D:/MyEmploye.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.println("serialized data is saved in /temp/employe.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
