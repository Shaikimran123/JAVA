package javaBasicTopics.Day9;

@FunctionalInterface
interface TestInterface1{
	
	void disp( String msg);
}


public class Demo2 {

	public static void main(String[] args) {

		
	TestInterface1 t=(String msg)->{
	
		System.out.println("lambda = "+msg);	
	
	};
	
	t.disp("disp");
	
	TestInterface1 ti=(msg)->{
		
		System.out.println("lambda = "+msg);	
	
	};
	
	ti.disp("msg");
}
}
