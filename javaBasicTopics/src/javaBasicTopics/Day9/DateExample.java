package javaBasicTopics.Day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {

		
		Date d=new Date();
		System.out.println(d);
		
		System.out.println(d.getDate());
		
		System.out.println(d.getDay());
		
		System.out.println("sep 9="+(d.getMonth()+1)); //jan=0
		
		System.out.println(d.getHours());
		
		System.out.println(d.getMinutes());
		
		System.out.println("-----------------------");
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d1=sdf.parse("30-09-2022");
		System.out.println(d1);
		
		System.out.println("-----------------------");
		
		String dd=sdf.format(d);
		System.out.println(dd);
		
		System.out.println("-----------------------");
		
		LocalDate ld=LocalDate.now();
		
		System.out.println(ld);
		
		System.out.println(ld.getMonth());
		
		System.out.println(ld.getMonthValue());
		
		System.out.println(ld.isLeapYear());
		
		System.out.println("----------------------");
		
		LocalDate ld1=LocalDate.of(2024, 10, 20);
		
		System.out.println(ld1);
		
		System.out.println(ld1.getMonth());
		
		System.out.println(ld1.getMonthValue());
		
		System.out.println(ld1.isLeapYear());
		
		System.out.println("15 days after 20th oct= "+ld1.plusDays(15));
		
		System.out.println("----------------------");
		
		LocalDate BookingTicket=LocalDate.of(2021, 9, 30);
		LocalDate currentDate=LocalDate.now();
		
		if(BookingTicket.isAfter(currentDate))
		{
			System.out.println("ur booking is accepted");
		}
		else
		{
			System.out.println("can't book tickets fr  past dates");
		}
		
		
		
		//LocalDateTime
		//LocalTime
		
		
		
	}

}
