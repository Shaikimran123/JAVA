package javaBasicTopics.Day4.packageA;

public class classB {
  
	
	public static void main(String[] args) {
		
		System.out.println(classA.classAvar);
		
//		System.out.println(classA.classAprivatevar);  private mem can't access
		
		System.out.println(classA.classAprotectedvar);
		
		System.out.println(classA.classdefaultvar);
	}
}
