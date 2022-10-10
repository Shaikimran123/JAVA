package javaBasicTopics.Day5.AnimalExample;


class Animals
{
	void move() {
		System.out.println("animal move");
	}
}

class Mover
{
	void moveanimal(Animals animal)
	{
		animal.move();
	}
}




public class Demo4 {

	public static void main(String[] args) {
		
		Animals animal=new Animals();
		
		Mover mover=new Mover();
		
		mover.moveanimal(animal);
		
		

		Animals animal1=new Tiger();
		
		Mover mover1=new Mover();
		
		mover.moveanimal(animal1);
		
	//===================================
		
		Animals animal2=new Monkey();
		
		Mover mover2=new Mover();
		
		mover.moveanimal(animal2);
		
	//====================================
		
		Animals animal3=new Donkey();
		
		Mover mover3=new Mover();
		
		mover.moveanimal(animal3);
	}

}



class Tiger extends Animals{
	@Override
	void move() {
		System.out.println("tiger move");
	}
	
}

class Monkey extends Animals{
	@Override
	void move() {
		System.out.println("monkey move");
	}
	
}

class Donkey extends Animals
{
	@Override
	void move() {
		System.out.println("Donkey move");
	}
	
}

