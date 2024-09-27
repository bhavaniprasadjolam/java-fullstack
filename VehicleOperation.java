package labprograms4;



class Vehicle {
	String make;
	String model;
	Vehicle(String make,String model) {
		
		System.out.println("make: "+make);
		System.out.println("model: "+model);
	}
}
class Car extends Vehicle{
	int year;
	
	Car(String make ,String model,int year){
		super(make,model);
		
		System.out.println("year: "+year);
	}
}
public class VehicleOperation {

	public static void main(String[] args) {
		Car alpha =new Car("constructed","Rangerover",2012);
	}

}