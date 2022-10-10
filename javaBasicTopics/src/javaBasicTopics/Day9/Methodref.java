package javaBasicTopics.Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methodref {

	public static void main(String[] args) {

		ArrayList<Object> test=new ArrayList<>();
		

		test.add("immu");
		test.add("immu");
		test.add("immu");
		test.add("immu");
		test.add("immu");
		
		test.forEach((x)->{System.out.println(x);}); //lambda expression
		
		System.out.println("--------------");
		
		test.forEach(System.out::println); //with references
		
		System.out.println("--------------");
		
		ArrayList<Integer> t=new ArrayList<>();

		t.add(1);
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(4);
		
		Stream<Integer> s= t.stream();
		
		s=s.filter((x)->(x>3));
		
		System.out.println(s.collect(Collectors.toList()));
		
		System.out.println("------1------------------");
		
		Stream<Integer> ss=t.stream().filter(x->(x>3));
		ss.forEach(x->{System.out.println(x);});
		
		System.out.println("------------------------");
		
		t.stream().filter(x->(x>3)).forEach(x->{System.out.println(x);});
		System.out.println("------------------------");
		
		t.forEach(x->{System.out.println(x);}); //filter does not effect to the actual list
		
		System.out.println("------------------0-----");
		
		t.stream().filter(x->(x%2==0)).forEach(x->{System.out.println(x);});
		
		System.out.println("--------------------------");
		
		List<Integer> gt3= t.stream().filter(x->(x>3)).collect(Collectors.toList());
		
		ArrayList<Integer> gtn3= (ArrayList<Integer>) t.stream().filter(x->(x>3)).collect(Collectors.toList());
		
		System.out.println(gt3);
		
		System.out.println(gtn3);
	}

}
