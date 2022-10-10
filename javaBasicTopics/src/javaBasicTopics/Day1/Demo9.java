package javaBasicTopics.Day1;

public class Demo9 {

	public static void main(String[] args) {
		int a=10;
		//a.
	
		String x="hello";
		//x.

		
		//int b=50; //premitive
		//String c=(String)b; //class

		//boxing , unboxing
		
		int b=50;
		
		Integer i=b;
		String c=i.toString();
		System.out.println(c);
		//------------------
		
		String aa="100";
		int bb=Integer.parseInt(aa);
		System.out.println(bb);
	}

}
