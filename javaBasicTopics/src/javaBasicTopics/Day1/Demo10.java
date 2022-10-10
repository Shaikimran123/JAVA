package javaBasicTopics.Day1;

public class Demo10 {

	public static void main(String[] args) {

		int ctr=0;
		for(int i=0;i<26;i++)
		{
			//0+65 =65
			//1 +65 =66
			System.out.println((char)(i+65));
			System.out.println((char)(i+'A'));
			System.out.println((char)(i+'a'));		
			ctr++;
			
		}
		
		System.out.println("ctr "+ctr);
		
		
		
		

		
	}
	
	

}
