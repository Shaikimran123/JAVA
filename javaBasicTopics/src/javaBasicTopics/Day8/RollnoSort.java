package javaBasicTopics.Day8;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRno() - o2.getRno() ; ////ascending
	//	return o2.getRno() - o1.getRno() ; ////descending
	}

}
