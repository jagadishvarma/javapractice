package string;

public class Student {

	private int id;
	private String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Since java compiler internally calls toString() method
	public String toString() {
		return "id: " + id + "  name: "+ name;
	}
}
