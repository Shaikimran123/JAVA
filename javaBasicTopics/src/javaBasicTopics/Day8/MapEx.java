package javaBasicTopics.Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		
		Map<Integer, String> Mymap=new HashMap<>();
		
		Mymap.put(18, "immu");
		Mymap.put(19, "ummi");
		Mymap.put(20, "kr");
		Mymap.put(21, "jaga");
		Mymap.put(28, "soor");
		
		System.out.println(Mymap.get(20));
		
		System.out.println("----------------------");
		
		Set<Integer> keys=Mymap.keySet();
		
		System.out.println(keys);
		
		System.out.println("----------------------");
		
		for(int key:keys)
		{
			System.out.println(key+"-"+Mymap.get(key));
		}
		
		System.out.println("-----------------------");
		
		System.out.println(Mymap.entrySet());
		
		Set<Entry<Integer, String>> myset=Mymap.entrySet();
		
		System.out.println(myset);
		
		for(Entry<Integer, String> etr:Mymap.entrySet()) {
			
			System.out.println(etr);
			
			System.out.println(etr.getKey() + "=" + etr.getValue());
		
		}
		
		System.out.println("------------------------");
		
		

	}

}
