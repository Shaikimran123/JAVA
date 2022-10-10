package javaBasicTopics.Day4.packageB;

import javaBasicTopics.Day4.packageA.classA;

public class classD extends classA{

	public static void main(String[] args) {
		
		System.out.println(classA.classAvar);
		
//		System.out.println(classA.classAprivatevar); cant access
		
//		System.out.println(classA.classAprotectedvar); The field classA.classAprotectedvar is not visible
		
		System.out.println(classA.classAprotectedvar); // here we can accessed bcz we are extented class d to the class A
	
	//  System.out.println(classA.classdefaultvar); // The field classA.classdefaultvar is not visible even if it is child also we cant access
	}

}
