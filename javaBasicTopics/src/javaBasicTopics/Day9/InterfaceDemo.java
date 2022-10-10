package javaBasicTopics.Day9;

interface testInterface{
	void disp();
}

class test implements testInterface{

	@Override
	public void disp() {
		System.out.println("disp method");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		 
		//traditional way 
		testInterface ti=new test();
		ti.disp();
		
		System.out.println("-------------------------------------------");
			
		//Anonymous inner type
		testInterface t= new testInterface() {
			
			@Override
			public void disp() {
				System.out.println("Anonymous inner type disp method ?????????????");				
			}
		};	
		
		t.disp();
		
		System.out.println("-------------------------------------------");
		
		//lambda expressions
		testInterface lt= ()->{
			System.out.println("disp methond through lambda");
		};
		
		lt.disp();
		
		System.out.println("-------------------------------------------");
		

	}

}
