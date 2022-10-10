package javaBasicTopics.Day7;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	
	void abc() throws IOException {
		
	}
}

class Child extends Parent{
	@Override
	//child cant throw new checked exception
	//Exception ClassNotFoundException is not compatible with throws clause in Parent.abc()	
	//parent throws parent exception so every child exception can be throws by child exception
	//void abc() throws ClassNotFoundException {
		void abc() throws IOException ,NullPointerException,IllegalArgumentException,ArrayIndexOutOfBoundsException, FileNotFoundException
	{
		
	}
	
}



public class ParentChildException {

	public static void main(String[] args) {

	}

}
