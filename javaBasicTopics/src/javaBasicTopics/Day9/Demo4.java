package javaBasicTopics.Day9;


interface interfacedemo{
	
	void abc();
	
	//void cd();
}


public class Demo4 {

//	public static void Mymethod() {
//		
//		System.out.println("My method");
//	}
	
	private void Mymethod() {
		
		System.out.println("My method");
	}
	
	
	public Demo4() {
		System.out.println("def const");
	}
	
	public static void main(String[] args) {

		Demo4 d=new Demo4();
		
		//interfacedemo i=new Demo4()::Mymethod;
		
		interfacedemo i=d::Mymethod;
		
		i.abc();
		
		interfacedemo id=Demo4::new;  //without creating an obj also we can 
		
		id.abc();
		
	}

}
