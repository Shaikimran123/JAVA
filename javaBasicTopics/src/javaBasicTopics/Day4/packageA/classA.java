package javaBasicTopics.Day4.packageA;

public class classA {

	public static int classAvar=50;
	
	private static int classAprivatevar=90;
	
	protected static int classAprotectedvar=90;
	
	static int classdefaultvar=90;
	
	static class testing{
		static void aa() {
			System.out.println(classAprivatevar); 		
			// inner cls is a part of outer class thats y private mem can be accessed
			System.out.println(classA.classAprotectedvar);
			System.out.println(classA.classdefaultvar);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("main"+classAprivatevar);
		System.out.println("main"+classA.classAprotectedvar);
	}
	

}

class testing
{
	public static void main(String[] args) {
//		System.out.println(classAprivatevar);  same file diff class also private mem cant access
		System.out.println(classA.classAprotectedvar);
		System.out.println(classA.classdefaultvar);
	}
}

/* 
 * package == collection of related classes
 * public == everyone
 * protected == child cls + same package; outside the package cant access but if protected clss is a clild clss which means if it is extended then we can access 
 * private == with the same class
 * default
 */
 
