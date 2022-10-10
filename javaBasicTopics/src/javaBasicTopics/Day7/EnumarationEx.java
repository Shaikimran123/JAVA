package javaBasicTopics.Day7;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Collections;

public class EnumarationEx {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> t=new ArrayList<>();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		
		Enumeration<Integer> itr=Collections.enumeration(t);
		 
		while(itr.hasMoreElements())
		{
			int nxt=itr.nextElement();
			System.out.println(nxt);
			
			 
//			itr.remove() no method 
			
			if(nxt%2==0)
				System.out.println(nxt+" is even");
			else
				System.out.println(nxt+" is odd");
		}
		
		
	}

}
