package javaBasicTopics.Day4.packageA;

public class classC {

	public static int classCStaticvar=50;
	
	public  int classCNonStaticvar=50;  // goto the javaBasicTopics.Day4.packageB;
	
	public static void outside() {
		System.out.println("this is ststic fn frm classC");
	}

	public static void main(String[] args) {
		outside();
	}
}
