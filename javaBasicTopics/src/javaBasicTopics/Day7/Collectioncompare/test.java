package javaBasicTopics.Day7.Collectioncompare;

import java.util.ArrayList;
import java.util.Collections;


public class test {

	public static void main(String[] args) {
		
		Student s0=new Student("soor",5,1);	
		
		Student s1=new Student("ummi",9,2);
		
		Student s2=new Student("soor ",0,1);
		
		ArrayList<Student> s=new ArrayList<>();
		
		s.add(s0);
		s.add(s1);
		s.add(s2);
		
		Collections.sort(s,new RollnoSort());
		
		for(Student stud:s) {
			
			System.out.println(stud);
			
		}
		System.out.println("name sorting");
		
		
		Collections.sort(s,new NameSort());
		
		for(Student stud:s) {
			
			System.out.println(stud);
			
		}
		
		
	}

}
