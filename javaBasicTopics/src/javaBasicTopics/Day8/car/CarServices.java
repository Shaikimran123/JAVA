package javaBasicTopics.Day8.car;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CarServices {
	
	Map<String, Car> cars=new HashMap<>();
	
	//Map<String, Car> cars=new Hashtable<>(); //Exception in thread "main" java.lang.NullPointerException Line no:42
	
	void addCar(String CarName, Car car){
		
		cars.put(CarName, car);
		
	}
	
	Car searchCar(String name) {
		
		return cars.get(name);
		
	}
	
	
public static void main(String[] args) {
	
	CarServices carServices=new CarServices();
	
	Car car1=new Car("BMW","BLACK","Maruti");
	Car car2=new Car("safari","BLACK","kr");
	Car car3=new Car("tigor","BLACK","immu");
	Car car4=new Car("lambargini","BLACK","tata");
	Car car5=new Car("nexon","BLACK","tata");	
	
	carServices.addCar(car1.getName(), car1);
	carServices.addCar(car2.getName(), car2);
	carServices.addCar(car3.getName(), car3);
	carServices.addCar(car4.getName(), car4);
	carServices.addCar(car5.getName(), car5);
	
	//carServices.addCar(null, null);
	
	Car car=carServices.searchCar("immmu");
	
	if(car==null)
		System.out.println("da car u searched is nt found");
	else
		System.out.println(car);
	
	
}	
	
	

}
