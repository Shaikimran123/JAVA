package javaBasicTopics.Day4;

// impossible to create obj witout constructor ->true
public class MyFrstJavaCode {

	void disp() {
		System.out.println("disp fun");
	}
	
	public static void main(String[] args) {
		
		MyFrstJavaCode myFrstJavaCode=new MyFrstJavaCode();
		
		new MyFrstJavaCode().disp(); //through obj
		
		myFrstJavaCode.disp(); // through references
		
		

	
	}

}
