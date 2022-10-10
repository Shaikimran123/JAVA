package javaBasicTopics.Day4;

public class ConEx2 {
	
	void add(int x, int y) {
		System.out.println(x+y);
	}

	void add(int x, int y,int z) {
		System.out.println(x+y+z);
	}
	
	void add(char x, int y) {
		System.out.println(x+y);
	}

	void add(int y, char x) {
		System.out.println(x+y);
	}


	
	public static void main(String[] args) {
		ConEx2 c1=new ConEx2();
		c1.add(1, 2);
		c1.add('A', 10);
		
	}

}
