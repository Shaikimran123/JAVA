package javaBasicTopics.Day9;

import java.util.ArrayList;
import java.util.Collections;


public class DemoStud {

	public static void main(String[] args) {

		Student student1=new Student("immu",4,50);
		Student student2=new Student("ummi",3,50);
		Student student3=new Student("kr",2,50);
		Student student4=new Student("jaga",1,50);
		
		ArrayList<Student> studs=new ArrayList<Student>();
		
		studs.add(student1);
		studs.add(student2);
		studs.add(student3);
		studs.add(student4);
		
		//Collections.sort(studs,(o1,o2)->{return o1.getRno() -o2.getRno(); });
		
		Collections.sort(studs,(o1,o2)->(o1.getRno() -o2.getRno()) );
		
		
		for(Student s:studs)
		{
			System.out.println(s);
		}
		
		System.out.println("------------------");
		
		studs.forEach( (x)->{System.out.println(x);});
		
		
		
		
	}

}
