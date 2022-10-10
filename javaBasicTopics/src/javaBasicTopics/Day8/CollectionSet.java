package javaBasicTopics.Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		
		
		Set<Integer> Myset=new HashSet<>();
		
		Myset.add(10);
		Myset.add(10);
		Myset.add(18);
		Myset.add(12);
		Myset.add(13);

		System.out.println(Myset);
	
		//-------------------------------
		
		List<Integer> Mylst=new ArrayList<>(Myset);
		
		Collections.sort(Mylst);
		
		System.out.println(Mylst);
		
		//------------------------------treeset
		
		Set<Integer> Mytreeset=new TreeSet<>(Collections.reverseOrder());
		
		Mytreeset.add(10);
		Mytreeset.add(10);
		Mytreeset.add(18);
		Mytreeset.add(12);
		Mytreeset.add(13);
		
		System.out.println(Mytreeset);
		
	}

}
