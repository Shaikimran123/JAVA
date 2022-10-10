package javaBasicTopics.Day8;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		
		PriorityQueue<Student> pq=new PriorityQueue<>(new RollnoSort());
		
		pq.add(new Student("immu",1,100));
		pq.add(new Student("ummi",2,90));
		pq.add(new Student("kr",3,80));
		
		
	System.out.println(pq.poll());
	System.out.println(pq.poll());
	System.out.println(pq.poll());
		
		

	}

}
