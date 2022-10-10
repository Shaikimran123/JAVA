package javaBasicTopics.Day8;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetStud {

	
	
public HashSet<Student> getStudents(){
		
		HashSet<Student> Myhashset=new HashSet<>();
		
		Myhashset.add(new Student("immu",10,100));
		Myhashset.add(new Student("ummi",9,100));
		Myhashset.add(new Student("soor",10,100));
		Myhashset.add(new Student("kr",1,100));
		
		return Myhashset;
		
		
	}
	
	public static void main(String[] args) {
	
		TreesetStud ts=new TreesetStud();
		
		HashSet<Student> hset=ts.getStudents();
		
		TreeSet<Student> tset=new TreeSet<>(new NameSort());
		
		tset.addAll(hset);
		
		for(Student s:tset) {
		
			System.out.println(s);
			
		}
	}
	

}
