package javaBasicTopics.Day5;


class calcul{
	void add(long x) {
		System.out.println("parent version of add meth");
	}	
}


class ScinCal extends calcul{
	@Override
	void add(long y) {
		System.out.println("child version of add meth");
	}
}

public class Demo2 {

	public static void main(String[] args) {
	
		ScinCal sc=new ScinCal();
		sc.add(10);  // child if int in parameters
		sc.add(10L); // parent if long in paramerets
		//if parameters of parent and child clses are same thn it will return the child obj
	}

}
