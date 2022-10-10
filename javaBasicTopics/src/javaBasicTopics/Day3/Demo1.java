package javaBasicTopics.Day3;

public class Demo1 {

	public static void main(String[] args) {
//	
//		for(int i=0;i<5;i++) {
//			
//			for(int j=0;j<2;j++) {
//				
//				System.out.println("i "+i+" j "+j);
//				
//				if(i==2)
//					break;
//		i 0 j 1
//		i 1 j 0
//		i 1 j 1
//		i 2 j 0
//		i 3 j 0
//		i 3 j 1
//		i 4 j 0
//		i 4 j 1
//			}
//		}
		

//		for(int i=0;i<5;i++) {
//			
//			if(i==2)
//				break;
//			
//			for(int j=0;j<2;j++) {
//				
//				System.out.println("i "+i+" j "+j);			
//				
//			
////				i 0 j 0
////				i 0 j 1
////				i 1 j 0
////				i 1 j 1
//
//			}
//		}   
		
		
//		int j=0;
//		for(int i=0;i<5;i++) {
//			
//			for(j=0;j<2;j++) {
//				System.out.println("i "+i+" j "+j);	
//			}
//			if(i==2 && j==1)
//				break;
//		}
		
//		
//		int j=0;
//		for(int i=0;i<5;i++) {
//			
//			for(j=0;j<2;j++) {
//				if(i==2 && j==1)
//					break;
//				System.out.println("i "+i+" j "+j);	
//				
//			}
//		}
		
		int j=0;
		otr:
		for(int i=0;i<5;i++) {
			inr:
			for(j=0;j<2;j++) {
				if(i==2 && j==1)
//					break this is always breaks inner loop
					break otr;  //through inner loop breaking the outer loop using loop label concept
				System.out.println("i "+i+" j "+j);	
//				i 0 j 0
//				i 0 j 1
//				i 1 j 0
//				i 1 j 1
//				i 2 j 0
			}
			
		}
		
		
		
		
		
		
	}

}
