package javaBasicTopics.Day1;

public class Demo3 {

	int x; 	
	void init(){
		x=10;
	}
	
	void disp(){
		System.out.println(x);
	}
	
	
	
	public static void main(String[] args) {
		Demo3 m=new Demo3();
		m.disp();// 0
		m.init();//x=10	
		m.disp();// 10

	}

}
