package javaBasicTopics.Day1;

public class Demo5 {

	
	int x;
	static int y;
	// static var have their own memory , 
	// class vars
	// tied up with class 
	//appers to exist even b4 object 
	public Demo5(){
		x=10;
		y=50;
	}
	
	void disp(){
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println("y = "+y);
		//System.out.println("x = "+x);
		//x cannot exist without object
		
		Demo5 m=new Demo5(); // x=10 y=50
		m.disp();// 10
		
		System.out.println(y);
	}

}
