package javaBasicTopics.Day9;

import java.util.Optional;

public class OPtionalExample {

	public static void main(String[] args) {

		String name="immu";
		
		//name.toLowerCase();
		
		Optional<String> Oplstr= Optional.ofNullable(name);
		
		String res=Oplstr.orElse("name is null").toUpperCase();
		
		System.out.println(res);
		
		System.out.println("-------------");
		
		Optional<String> Optstr=Optional.ofNullable(name);
		
		if(Optstr.isPresent()) 
		{
			String nam1=Optstr.get();
			System.out.println("not null = "+nam1.toUpperCase());
		}
		else
			System.out.println("name is null");
				
		
	}

}
