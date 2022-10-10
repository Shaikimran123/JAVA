package javaBasicTopics.Day7.CollectionExample;





//comparable
//comparator thiz 2 r user defined sorting
public class student {

	String name;
	int rollno;
	int marks;
	
	public student() {
		// TODO Auto-generated constructor stub
	}

	public student(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
