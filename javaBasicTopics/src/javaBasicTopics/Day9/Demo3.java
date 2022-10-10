package javaBasicTopics.Day9;


@FunctionalInterface
interface Test{
	
	float convertor(float d);
}


public class Demo3 {

	public static void main(String[] args) {


		Test t=(d)->{
		
		float f=(d*80);
		return f;
			
	};
	
	float r = t.convertor(1);
	
	System.out.println(r+" rupees");
	
	System.out.println("---------------------------------------------");
	
	Test it=(d)->(d*80);
	
	float x=it.convertor(2);
	
	System.out.println(x+" rupees");
	
	
	}
	

}
