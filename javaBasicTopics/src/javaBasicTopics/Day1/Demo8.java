package javaBasicTopics.Day1;

public class Demo8 {

	public static void main(String[] args) {

		byte age=127;
		int pin=586101;
		long call=9988776655L;
		System.out.println(age);

		float x= 15.5F;
		double y=10.5;
		
		
		//4 bytes(32 bits)
		int a1=257;
		//byte b1=a1; error possible loss of pricision
		// 1 byte 8 bits

		byte b1=(byte)a1;// int geting into byte explicit
		
		System.out.println(a1);
		System.out.println(b1);
		
		System.out.println(call);
		byte a=100;
		int b=a; // byte getting into int // implicit 
		
		
		
		//-----------------------------
		int aa = 200;
		byte bb= (byte)a;
		
		System.out.println(bb);
		double aa1=50.5;
		float aa2=(float)aa1;
		
		System.out.println(aa2);

		//by def compiler reads all decimal values as double
		
		float xx=(float)10.5;
		float yy=10.5f;
		
		//both are same

	}

}


//2
//premitive (8)  --- class type

//simple values

//8 bits ,16 bits, 32 bits , 64 bits
//byte , short ,  int  ,   long

//float , double
//char
//boolean

//-------------------------class type

//class type- > objects including those which u create by urself 
//class -> user Def data type 
//Car , Dog , Calculator , String 


//type casting -. conversion of data type from one type to another

