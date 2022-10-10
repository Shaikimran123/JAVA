package javaBasicTopics.Day8;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

	public static void main(String[] args) {

		
	ArrayBlockingQueue<String> ll=new ArrayBlockingQueue<>(10);
		
		ll.add("bngllor");
		ll.add("pune");
		ll.add("ap");
		ll.add("atp");
		ll.add("hdpur");
		ll.add("kunool");
		ll.add("hyd");
		ll.add("chenni");
		//ll.add("krp");
		ll.add("Mysour");
		
		
		
		System.out.println(ll);
		
//		ll.add("hyd");
//		
//		Exception in thread "main" java.lang.IllegalStateException: Queue full
//		
//		System.out.println(ll);
		
		ll.offer("immu");
		
		System.out.println(ll);
	}

}
