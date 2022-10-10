package javaBasicTopics.Day7;

import java.util.ArrayList;


public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> test=new ArrayList<Integer>();
		
		Integer i=10;
		test.add(i);
		
		int x=20;
		test.add(x); // auto boxing
		
		test.add(30);
		test.add(20);
		test.add(5);
		test.add(2,900);
		System.out.println("test = "+test);
		
		//test.remove(900); //exception  900 consider as a index 
		//test.remove(0);
		Integer val=900; // obj type
//		int val=900;	//premitive type
		test.remove(val);
		System.out.println(test);
	}

}


//Arraylist : Thread unsafe (unsynchronized)--> fast

//vector    : Thread safe   --> slow






















