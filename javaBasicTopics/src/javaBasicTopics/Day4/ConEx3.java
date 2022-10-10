package javaBasicTopics.Day4;

public class ConEx3 {
//this concept called variable args
	void sum(int... x) {
		System.out.println(x.length);
		System.out.println("x[0]="+x[0]);
		System.out.println("sum fun called");
	}
	public static void main(String[] args) {
		
		ConEx3 m=new ConEx3();
		//m.sum();
		m.sum(1);
		m.sum(1,2,3,4);
		//m.sum(null);
	}

}
