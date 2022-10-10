package javaBasicTopics.Day5;


class animal{
	void move(){
		System.out.println("move method"); 
	}
	void eat(){
		System.out.println("eat method");
	}
}

class tiger extends animal{
	@Override
	void eat(){
		System.out.println("tiger eat meat method");
	}
	void roar(){
		System.out.println("tiger roars method");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		tiger t=new tiger();
//		t.move();
//		t.eat();
//		t.roar();
		animal a=new tiger();
		a.eat();
		a.move();
//		a.roar(); only belonging to the parent methods will be called
	}

}
