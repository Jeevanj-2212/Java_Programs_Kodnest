package oop;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carDetails d = new carDetails();
		d.brand = "Tata";
		d.price = 1000000;
		System.out.println("Brand "+d.brand);
		System.out.println("Price "+d.price);
		d.drive();

	}

}
class carDetails{
	String brand ;
	int price ;
	void drive() {
		System.out.println("You can drive "+brand+" car in 80kmph Please drive safe");
	}
}
