package javaBasicTopics.Day7;

import java.io.IOException;

public class ThrowExcep {

	
	void test(int x)
	{
		if(x>10)
			throw new IllegalArgumentException();
//			throw new NullPointerException();
//			throw new IOException(); //Unhandled exception type IOException (needs try catch surrounding) 
		else
		{
			System.out.println("selected");
		}
	}
	
	public static void main(String[] args) {
		ThrowExcep t=new ThrowExcep();
		t.test(18);  //if the exception is raised here the whole program will be terminated
		System.out.println("after test");
	}

}


/*               Throwable
 *
 *    error                        exception
 *  (unchecked)                    (checked)
 *                         IOException           runtime exception(unchecked)
 *  */
 
