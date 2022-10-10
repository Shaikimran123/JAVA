package javaBasicTopics.Day1;

public class Demo6 {

	
	int x;
	static int y;
	// static var have their own memory , 
	// class vars
	// tied up with class 
	//appers to exist even b4 object 
	public Demo6() {

		x=10;
	
	}
	//some programming uses this as static constructor
	// static initilizer ?? used to initilize static data members of a class
	static
	{
		y=50;	
	}
	
	void disp(){
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("y = "+y);
		//System.out.println("x = "+x);
		//x cannot exist without object
		
		Demo6 m=new Demo6(); // x=10 y=50
		m.disp();// 10
		
		System.out.println(y);
	}

}
