package javaBasicTopics.Day4.packageB;

//import static javaBasicTopics.Day4.packageA.classC.classCStaticvar;
////only classCstaticvar is imported we cant access the other then clscstataicvar;
// 
//import static javaBasicTopics.Day4.packageA.classC.outside;
////only outside fn

import static javaBasicTopics.Day4.packageA.classC.*;
//everything will be accessed with * 


import javaBasicTopics.Day4.packageA.classC;
//this will import classC


public class classE {
	
	

	public static void main(String[] args) {
		
		System.out.println(classCStaticvar);  // we can access direct static var bcaz of by importing static (fully qualified name) 
		
	//	System.out.println(classc.classCNonStaticvar); cant access non static mem
		
		classC c=new classC();
		System.out.println(c.classCNonStaticvar); // with the help of obj we can access non static mems
		System.out.println(c.classCStaticvar); // ststic also accessed with obj
		
		classC.outside(); // traditional way
		
		outside(); // with the help of importing line no 6
		
	}

}
