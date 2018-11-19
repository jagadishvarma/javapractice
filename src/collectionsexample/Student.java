package collectionsexample;

import java.io.Serializable;

public class Student implements Serializable {
	
	public int id;
	public String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

}
