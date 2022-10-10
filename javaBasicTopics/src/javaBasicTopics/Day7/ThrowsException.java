package javaBasicTopics.Day7;

import java.io.FileNotFoundException;


public class ThrowsException {
	
	//redirects the exception to the caller
	void test() throws FileNotFoundException {
		
		throw new FileNotFoundException();
		//used to raise the exception
	}
	

	void test(int x) throws FileNotFoundException
	{
		test();
		
	///	new FileOutputStream("test.txt");  
	}
	
	public static void main(String[] args){
		
		ThrowsException t=new ThrowsException();
		try {
			t.test(55);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Unhandled exception type FileNotFoundException
		//2 ways 1: add throws exception (it is not a best way for all the times)  
		//       2: try catch surrounding
		System.out.println("after test");

	}

}
