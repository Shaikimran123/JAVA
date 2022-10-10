package javaBasicTopics.Day7;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//only wrapper clses 
		Vector<Integer> rollnos=new Vector<>();
		
		rollnos.add(1);
		rollnos.add(2);
	//	rollnos.add("hello"); //The method add(Integer) in the type Vector<Integer> is not applicable for the arguments (String)

		System.out.println(rollnos);
		
		
		Vector<Object> rollno=new Vector<>();
		rollno.add(1);
		rollno.add(2);
		rollno.add("hel");
		System.out.println(rollno);
		
		
		Vector<Integer> test=new Vector<>();
		
		Integer i=10;
		test.add(i);
		
		int x=20;
		test.add(x); // auto boxing
		
		test.add(30);
		test.add(20);
		test.add(5);
	
		System.out.println("test = "+test);
	}

}
//list--> ordered, contains duplicates
