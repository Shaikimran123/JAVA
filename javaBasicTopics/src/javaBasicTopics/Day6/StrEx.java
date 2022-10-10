package javaBasicTopics.Day6;

public class StrEx {
	
	public int CapsCase(String s) {
		char[] ar=s.toCharArray();
		
		for(char c:ar) {
			System.out.println(c);
		}
		return 0;
	}

	public static void main(String[] args) {
	
	String str="heLlo";
	
	new StrEx().CapsCase(str);
		
	
	}

}
