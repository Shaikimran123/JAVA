package javaBasicTopics.Day8;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashsetexample {

	
public LinkedHashSet<Student> getStudents(){
		
		LinkedHashSet<Student> Myhashset=new LinkedHashSet<>();
		
		Myhashset.add(new Student("immu",10,100));
		Myhashset.add(new Student("ummi",9,100));
		Myhashset.add(new Student("soor",10,100));
		Myhashset.add(new Student("kr",1,100));
		
		return Myhashset;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Linkedhashsetexample l=new Linkedhashsetexample();
		
		LinkedHashSet<Student> lhset=l.getStudents();
		
		for(Student s:lhset) {
			System.out.println(s);
		}
	}

}
