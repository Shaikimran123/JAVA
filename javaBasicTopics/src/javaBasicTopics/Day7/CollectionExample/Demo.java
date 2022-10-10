package javaBasicTopics.Day7.CollectionExample;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		
		student s0=new student("immu",590,600);	
		
		student s1=new student("ummi",590,600);
		
		student s2=new student("soor ",590,600);
		
		ArrayList<student> s=new ArrayList<>();
		
		s.add(s0);
		s.add(s1);
		s.add(s2);
		
		for(student stud:s) {
			
			System.out.println(stud);
			
		}
			

	}

}
