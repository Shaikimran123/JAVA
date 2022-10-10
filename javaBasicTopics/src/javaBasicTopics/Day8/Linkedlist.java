package javaBasicTopics.Day8;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("bngllor");
		ll.add("pune");
		ll.add("ap");
		ll.add("atp");
		ll.add("hdpur");
		ll.add("kunool");
		ll.add("hyd");
		ll.add("chenni");
		ll.add("krp");
		
		System.out.println(ll);
		
		ll.remove();
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("poll = "+ll.poll()); //pollfirst
		
		System.out.println("after poll");
		
		System.out.println(ll);
	
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("peek = "+ll.peek());
		
		System.out.println("after pek");
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("peek first = "+ll.peekFirst());
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("poll last = "+ll.pollLast());
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("peek last = "+ll.peekLast());
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		ll.offer("mysour");
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		ll.offerFirst("bnglor");
		
		ll.offerLast("hubli");
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		ll.add(null);
		
		ll.offer(null);
		
		ll.addFirst(null);
		
		ll.offerFirst(null);
		
		System.out.println(ll);
		
		System.out.println("--------------------------------------------------------------");
		
		
	}

}
