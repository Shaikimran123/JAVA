package javaBasicTopics.Day8;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetEx {

	public HashSet<Integer> getElements(){
		
		HashSet<Integer> Myhashset=new HashSet<>();
		
		Myhashset.add(10);
		Myhashset.add(20);
		Myhashset.add(30);
		Myhashset.add(100);
		Myhashset.add(40);
		Myhashset.add(50);
		Myhashset.add(60);
		
		return Myhashset;
		
		
	}
	
	
	public static void main(String[] args) {
	
		
		
		TreesetEx t=new TreesetEx();
		
		HashSet<Integer> hset=t.getElements(); 
		
		TreeSet<Integer> tset=new TreeSet<>();
		
		tset.addAll(hset);
		
		System.out.println(tset);

	}

}
