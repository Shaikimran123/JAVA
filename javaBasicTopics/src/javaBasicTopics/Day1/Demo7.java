package javaBasicTopics.Day1;

public class Demo7 {
	
	static int y;
	//1
	static
	{
		System.out.println("static block");
		y=50;	
	}
	//2
	public static void main(String[] args) {

		System.out.println("main");
		System.out.println("y = "+y);//0
	}

}
