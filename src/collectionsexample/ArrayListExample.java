package collectionsexample;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String args[]) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("jaggu");
		al.add("varma");
		al.add("jagguss");
		al.add(0, "alluri");
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		
		ai.add(1);
		ai.add(2);
		ai.add(3);
		ai.add(2);
		
		ai.remove(Integer.valueOf("3"));
		ai.removeAll(Arrays.asList(2));
		
		System.out.println(ai);
		System.out.println(al.get(1));
		System.out.println(al.lastIndexOf("jaggu"));
		Object al1 =  al.clone();
		System.out.println(al1);
		
		Iterator<String> it= al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String ob:al) {
			System.out.println(ob);
		}
		
		Student s1 = new Student(1, "alluri");
		Student s2 = new Student(2, "priya");
		Student s3 = new Student(3, "janu");
		
		ArrayList<Student> as = new ArrayList<Student>();
		
		as.add(s1);
		as.add(s2);
		as.add(s3);
		
		Iterator<Student> itr = as.iterator();
		
		while(itr.hasNext()) {
			Student s= (Student)itr.next();
			System.out.println(s.id+"  "+s.name);
		}
		
		try {
			File f = new File("/home/jagadish/projects/html wireframes/demo.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(as);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
			
			Iterator<Student> i = list.iterator();
			while(i.hasNext()) {
				Student ss = (Student) i.next();
				System.out.println(ss.id+ " name= "+ss.name);
			}
		}
		catch (Exception e) {
			System.out.println(e);	
		}
	}

}
