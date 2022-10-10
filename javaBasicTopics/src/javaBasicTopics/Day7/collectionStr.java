package javaBasicTopics.Day7;

import java.util.ArrayList;
import java.util.Collections;

public class collectionStr {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> t=new ArrayList<>();
		
		t.add("immu");
		t.add("ummi");
		t.add("abcd");
		t.add("rahul");
		t.add("soor");
		t.add("maha");
		t.add("pooji");
		
		System.out.println(t);

		Collections.sort(t);
		System.out.println(t);
		
		Collections.sort(t, Collections.reverseOrder());
		System.out.println(t);
		
	}

}
