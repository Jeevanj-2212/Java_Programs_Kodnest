package constructor;

public class CarInfoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Mahindra", "black", 950000);
		c.carInfo();

	}

}
class Car {
	String brand;
	String color;
	int price;
	public Car (String brand,String color , int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	void carInfo() {
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}
	
}
