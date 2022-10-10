package javaBasicTopics.Day7;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListIteration {

	public static void main(String[] args) {
	
		ArrayList<Integer> test=new ArrayList<>();
		
		Integer i=10;
	
		int x=11;
		
		test.add(i);
		test.add(x);
		
		test.add(20);
		test.add(22);
		test.add(25);
		test.add(2);
		test.add(29);
		
		System.out.println(test);
		
		Iterator<Integer> testiter=test.iterator();
		
		
		while(testiter.hasNext())
		{
			int next=testiter.next();
			System.out.println(next);
			System.out.println("plus 10 "+(next+10));

			
			if(next%2==0)
				System.out.println(next+" is even");
			else
				System.out.println(next+" is odd");
			
			
			if(next==10)
				testiter.remove();
		}
		
		System.out.println(test);
		
	}

}
