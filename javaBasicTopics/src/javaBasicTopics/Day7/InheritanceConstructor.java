package javaBasicTopics.Day7;

class parentpp{
	
	public parentpp() {
		System.out.println("Parent constructor");
	}
	
	public parentpp(int x) {
		System.out.println("Parent constructor with args");
	}
}

class childcc extends parentpp{
	
//	parent constructors cant be in child class
//    parentpp() {
//		System.out.println("Parent constructor");
//	}
	public childcc() {
		super(); //The constructor parentpp() is undefined (searching for default const and it calls only parent default const
		//super(10); 
		System.out.println("child constructor");
	}
}

public class InheritanceConstructor {
	
	public static void main(String[] args) {
		
		childcc c=new childcc();
//		childcc cc=new childcc(10); constructor cant be inherited

	}

}
