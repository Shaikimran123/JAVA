package javaBasicTopics.Day9;

//@FunctionalInterface 
interface TestInterface
{
	void disp();
	void test();
}

public class Demo1 {

	public static void main(String[] args) {

		TestInterface t=new TestInterface() {
			
			@Override
			public void test() {
				 
				System.out.println("test");
				
			}
			
			@Override
			public void disp() {
				System.out.println("disp");
				
			}
		};
		
		t.disp();
		t.test();
		
		System.out.println("------------------------------------------");
		
		
		//Rule 1: The target type of this expression must be a functional interface
		
		//functional interface: interface with one abstract method
		
		TestInterface it=()->{
			
			System.out.println("disp");
			
		};
		
		
		
		
		
		
	}

}
