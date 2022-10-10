package javaBasicTopics.Day5;


class calculator{
	void add() {
		System.out.println("parent version of add meth");
	}
	
	void sub() {
		System.out.println("sub meth");
	}
	
	void mul() {
		System.out.println("mul meth");
	}
	
	void div() {
		System.out.println("div meth");
	}
}

class ScienCal extends calculator{
	//@Override
	void add() {
		System.out.println("child version of add meth");
	}
	void sign() {
		System.out.println("sign meth");
	}
	
	void cos() {
		System.out.println("cos meth");
	}
	
	void tan() {
		System.out.println("tan meth");
	}
	
	
}


public class Demo1 {

	public static void main(String[] args) {
	
	
		ScienCal sc=new ScienCal();
		sc.div();
		sc.add();
	}

}
