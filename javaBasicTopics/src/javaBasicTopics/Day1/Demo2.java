package javaBasicTopics.Day1;

public class Demo2 {

	//def value = 0
	//int 32 bits 4 bytes
	int x; // var is name given to memory
	
	
	// instance var : an instance var is tied up with instance of a class
	// appers to exist as long as the instance exist
	
	public static void main(String[] args) {
		Demo2 m=new Demo2(); 
		System.out.println(m.x);
	}

}
//instance var , class var , local var 