package javaBasicTopics.Day1;

public class Demo1 {


	// identifiers ?  name given to method , variable or class
	// int class ??
	//class in a key word cannot be a var name 
	//key words cannot b identifiers  
	
	 // _  n $  
	
	
	// execution path of a program ??  THREAD -primary - secondary
	
	//main is the name of a primary thread in java, dats d reason gets executed fst
	//in java 2 ways of creating thread .. 
	//extends Thread class or implements Runnable
	
	public static void main(String[] args) {
		
		
		String name=Thread.currentThread().getName();
		
		System.out.println("Name of the current thread is -- "+name);
		System.out.println("hello world");

	}
	//main is a key word ? NO  

		//special function ?? 
		//any method that is static needs no obj for its existance
		
		//wen we can create multiple functions
		//in one class how main gets executed fst ? 
}
