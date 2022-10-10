package javaBasicTopics.Day8;

public class Student {
	
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
	
	
	

}
