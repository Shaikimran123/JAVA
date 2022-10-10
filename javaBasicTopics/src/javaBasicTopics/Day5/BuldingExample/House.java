package javaBasicTopics.Day5.BuldingExample;


//only abstract cls can contains the abstract method
abstract class PlanConstruction{
	
 void Rooms() {
	 System.out.println("7 rooms");
 }
 
 final void sp() {
	 System.out.println("swimming");
 }
 
final void garden() {
	System.out.println("grass");
}

abstract void location();
}

class Builder{
	void Build(PlanConstruction construction) {
		construction.location();
		construction.Rooms();
		construction.garden();
		construction.sp();
	}
}


public class House {

	public static void main(String[] args) {
		
		//PlanConstruction plan=new PlanConstruction(); //Cannot instantiate the type PlanConstruction caz  its abstract
		FriendA friendA=new FriendA();
		friendA.location();
		friendA.garden();
		friendA.sp();
		friendA.Rooms();
		
		System.out.println("------------");
		
		FriendB friendB=new FriendB();
		friendB.location();
		friendB.garden();
		friendB.sp();
		friendB.Rooms();
		
		System.out.println("------------");
		
		Builder builder=new Builder();
		builder.Build(friendA);
		System.out.println("------------");
		builder.Build(friendB);
		
		System.out.println("------------");
		FriendC friendC=new FriendC();
		builder.Build(friendC);
	}

}


class FriendA extends PlanConstruction{

	@Override
	void location() {
		System.out.println("7 rooms at top of bulding nfd 1st floor will contains the swimming nd second floar can contain the grass");
		
	}
	
}

class FriendB extends PlanConstruction{

	@Override
	void location() {
		System.out.println("7 rooms at top of bulding nfd 1st floor will contains the swimming nd second floar can contain the grass");
		
	}
	
}


class FriendC extends PlanConstruction{

	@Override
	void Rooms() {
		System.out.println("5 rooms");
	}
	
	
	@Override
	void location() {
		System.out.println("7 rooms at top of bulding nfd 1st floor will contains the swimming nd second floar can contain the grass");
		
	}
	
}


