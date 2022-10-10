package javaBasicTopics.Day9;

@FunctionalInterface
interface TestBody{
	
	void disp();
	
						 // if i make final -> interface method can't be final
	default void test() { //Illegal modifier for the interface method test; only public, private, abstract, default, static and strictfp are permitted
		
		System.out.println("def method");
	}
	

	static  void testing() { 
		System.out.println("ststic body testing  method");
	}
	
}


public class InterfaceBody {

	public static void main(String[] args) {
		
		TestBody t=()->{System.out.println("disp");};
		
		t.disp();
		
		t.test();  //if i make static->This static method of interface TestBody can only be accessed as TestBody.tes
		
		System.out.println("------------------------------");
		
		TestBody tb=new TestBody() {
			
			@Override
			public void disp() {
				
				System.out.println("A Disp");
				
			}
			
			@Override
			public void test() {
				
				System.out.println("def method override");
			}
		};
		
		tb.disp();
		tb.test();
		
		System.out.println("-------------------");
		
		TestBody.testing();

	}

}
