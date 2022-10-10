package javaBasicTopics.Day5;

public class FinalEx {

	final int z; //The blank final field z may not have been initialized
	
	public FinalEx() { 
		// The blank final field z may not have been initialized
		z=6;
	}
	
	public static void main(String[] args) {
		
	final int x=10;
	System.out.println(x+10);
	//x=9;
	final int y;
	y=19;
	System.out.println(y);
//	y=0;
	
	}

}
