package string;

public class ToStringExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "jaggu");
		Student s2 = new Student(2, "varma");
		
		System.out.println(s1); // calls s1.toString()
		System.out.println(s2); // calls s2.toString()

	}

}

	//without toString method 
	//string.Student@4b67cf4d
	//string.Student@7ea987ac

	//with toString method
    //id: 1  name: jaggu
    //id: 2  name: varma