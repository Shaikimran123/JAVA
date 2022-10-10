package javaBasicTopics.Day4.packageB;

import javaBasicTopics.Day4.packageA.classC;


public class classF {

	
static String classCStaticvar="this is local var";
	
	static void disp() {
		System.out.println("DISP fun :" +classCStaticvar);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(classC.classCStaticvar);
		
		System.out.println(classF.classCStaticvar);
		
		new classF().disp();
		
	}

}
