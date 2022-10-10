package javaBasicTopics.Day7;


class InvalidMarksException extends Exception
{
	
	InvalidMarksException(String msg) {
		super(msg);  // parent cls const arg is called
	}
}

class EnterMarks{
	EnterMarks(int marks) throws InvalidMarksException
	{
		if(marks<0 || marks>100)
			throw new InvalidMarksException("ye kya marks hain??");
	}
}



public class UserException {

	public static void main(String[] args) {
	
		try {
			EnterMarks e=new EnterMarks(-98);
		} catch (InvalidMarksException e) {
			
			e.printStackTrace();
		}
System.out.println("DONE");
	}

}
