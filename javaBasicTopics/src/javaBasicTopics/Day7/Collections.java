package javaBasicTopics.Day7;

import java.util.Vector;

//Collection of elements homo herato
public class Collections {

	public static void main(String[] args) {
		
		
		
		Vector v=new Vector(); //implementation of list
		//Vector is a raw type. References to generic type Vector<E> should be parameterized
		
		int x=50;
		String y="hello world";
		float z=10.5F;
		
		v.add(x);
		v.add(y);
		v.add(z);
		
		v.insertElementAt("immu", 2);
		
		System.out.println(v);
		
		v.remove("immu");
		
		System.out.println(v);
	}
	

}
