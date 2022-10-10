package javaBasicTopics.Day8.car;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShowroomServices {

	public static void main(String[] args) {

		Car car1=new Car("BMW","BLACK","Maruti");
		Car car2=new Car("safari","BLACK","kr");
		Car car3=new Car("tigor","BLACK","immu");
		Car car4=new Car("lambargini","BLACK","tata");
		Car car5=new Car("nexon","BLACK","tata");
		
		
		Map<String, Car> cars1=new HashMap<>(); 
		
		
		cars1.put(car1.getName(), car1);
		cars1.put(car2.getName(), car2);
		cars1.put(car4.getName(), car4);
		

		ShowRoom showroom1=new ShowRoom("RNS Motors",cars1);
		
		
		Map<String, Car> cars2=new HashMap<>(); 
		
		
		cars2.put(car3.getName(), car3);
		cars2.put(car5.getName(), car5);

		ShowRoom showroom2=new ShowRoom("TVS Motors",cars2);
		
		
		Car car=showroom1.searchCar("BMW");
		
		if(car==null)
		{
			System.out.println("u searched car is not found");
		
			System.out.println("avalilable cars");
			
			Map<String, Car> carsinS1=showroom1.getCars();
			
			for(Entry<String, Car> s1car:carsinS1.entrySet()) {
				
				System.out.println(s1car.getValue());
			}
			
		}
		else
			System.out.println("Showroom1 = "+car);
		
		System.out.println("----------------------------------------------------");
		
		Car shcar=showroom2.searchCar("BMW");
		
		if(shcar==null)
		{
			
		System.out.println("u searched car is not found");
		
		System.out.println("avalilable cars");
		
		Map<String, Car> carsinS2=showroom2.getCars();
		
		for(Entry<String, Car> s2car:carsinS2.entrySet()) {
			
			System.out.println(s2car.getValue());
		}
		}
		else
			System.out.println("showromm2 = "+ car);
		
		
	}

}
