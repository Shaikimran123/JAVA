package javaBasicTopics.Day6;

public class CountCaps {

	public int Capscase(String s) {
		
		char[] a=s.toCharArray();
		
		int ctr=0;
		for(char c:a)
		{
			if(c>=65 && c<=90)
				ctr++;
		}
		return ctr++;
		
	}
	
	
	public static void main(String[] args) {
		String str="Hello WORLD";
		int ctr=new CountCaps().Capscase(str);
		System.out.println(ctr);
	}

}
