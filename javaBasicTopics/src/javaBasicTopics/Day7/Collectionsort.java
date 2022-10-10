package javaBasicTopics.Day7;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsort {

	public static void main(String[] args) {


		ArrayList<Integer> t=new ArrayList<>();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(7);
		t.add(1);
		System.out.println(t);
		
		Collections.sort(t);
		System.out.println(t);
		
		Collections.sort(t, Collections.reverseOrder());
		System.out.println(t);
		
		
		
	}

}
