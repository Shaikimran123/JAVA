package javaBasicTopics.Day7.Collectioncompare;


//collection sorting
//comparable  -compareTo(1 arg
//comparator  -compare(2 args



public class Student  implements Comparable<Student>{

	private String name;
	private int rno;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rno, int marks) {
		super();
		this.name = name;
		this.rno = rno;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rno=" + rno + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.marks -o.marks; //ascending
	//	return o.marks -this.marks;   //descending
		
		//returm this.rno -o,rno
		
		return this.name.compareTo(o.name); //str sorting
		
	}
	
	
	
}
