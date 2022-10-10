package javaBasicTopics.Day4;

public class ConstroctorEx1 {

	String color;
	public ConstroctorEx1() {
		color="red";
	}
	
	public ConstroctorEx1(String color) {
		this.color=color;
	}
	void painting() {
		System.out.println("im painting with the color "+color);
	}
	
	public static void main(String[] args) {
		
		ConstroctorEx1 m=new ConstroctorEx1();
		m.painting();
		
		ConstroctorEx1 m1=new ConstroctorEx1("green");
		m1.painting();
		m1.color="blue";
		m1.painting();
	}

}
