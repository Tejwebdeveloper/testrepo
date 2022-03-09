package Filehandling;

import java.io.Serializable;

public class Employe implements Serializable {

	//private transient int id;
	private int id;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(int id,String name) {
		this.id = id;
		this.name = name;
	}
	private String name;
}
