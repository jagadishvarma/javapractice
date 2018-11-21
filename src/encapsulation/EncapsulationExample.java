package encapsulation;

//Let's see the simple example of encapsulation that has only one field with its setter and getter methods.

public class EncapsulationExample {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setId(101);
		
		System.out.println(st.getId());

	}

}
