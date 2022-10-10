package javaBasicTopics.Day4;

public class ex4 {
//var arg must be last in arg list
//
	void sum(String y,int... x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		System.out.println(y);
		System.out.println("sum= "+sum);
	}
	public static void main(String[] args) {
	 
		ex4 m=new ex4();
//		m.sum(1,2,3);
//		m.sum(45,5);
		m.sum("immu", 1,3,4);

	}

}
