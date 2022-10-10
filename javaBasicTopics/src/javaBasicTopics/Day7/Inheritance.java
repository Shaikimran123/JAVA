package javaBasicTopics.Day7;


class parentP{
	int x=100;
	void test() {
		System.out.println("parent");
	}
	private void testing() {
		System.out.println("parent");
	}
}
class ChildC extends parentP{
	
	public ChildC() {
		System.out.println(x);
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		ChildC c=new ChildC();
		c.test();
//		c.testing(); //cant access bcaz private
	}

}
