package javaBasicTopics.Day5.InterfaceExample;



interface Flyer{
	
	void fly();
}



class parrot implements Flyer{

	@Override
	public void fly() {
		System.out.println("parrot fly");
		
	}
	
	
}

class spyderman implements Flyer{

	@Override
	public void fly() {
		
		System.out.println("spyderman fly");
	}
	
}

class aircrafts implements Flyer{
	
	@Override
	public void fly() {
		
		System.out.println("aircrafts fly");
	}
	
}







public class Demo {

	public static void main(String[] args) {
		

	}

}
