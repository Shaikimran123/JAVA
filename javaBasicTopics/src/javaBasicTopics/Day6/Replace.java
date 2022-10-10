package javaBasicTopics.Day6;

public class Replace {
	
	String Myreplace(String str, char find, char replace)
	{
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==find) {
				c[i]=replace;
			}
		}
		return new String(c);
	}

	public static void main(String[] args) {
		
	String res=new Replace().Myreplace("hello", 'e', 'l');
	System.out.println(res);
	}

}
