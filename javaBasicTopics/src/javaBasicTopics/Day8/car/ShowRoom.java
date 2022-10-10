package javaBasicTopics.Day8.car;

import java.util.Map;

public class ShowRoom {

	
	String name;
	Map<String, Car> cars;
	
	
	
	void addCar(String CarName, Car car){
		
		cars.put(CarName, car);
		
	}
	
	Car searchCar(String name) {
		
		return cars.get(name);
		
	}
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	
	public ShowRoom() {
		
	}
	public ShowRoom(String name, Map<String, Car> cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", cars=" + cars + "]";
	}
	
	
	
	
	
}
