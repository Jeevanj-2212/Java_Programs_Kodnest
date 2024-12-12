package polymorphism;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c ;
		c = new SportsCar();
		accessCar(c);
		c = new OffroadCar();
		accessCar(c);
		  
		
		

	}
	public static void accessCar(Car c) {
		c.color();
		c.feature();
		c.tyreSize();
	}

}
class Car {
	void color() {
		
	}
	void tyreSize() {
		
	}
	void feature() {
		
	}
}
class SportsCar extends Car {
	void color() {
		System.out.println("Black color");
	}
	void tyreSize() {
		System.out.println("16 inch");
	}
	void feature() {
		System.out.println("400 hp");
	}
}
class OffroadCar extends Car {
	void color() {
		System.out.println("Red color");
	}
	void tyreSize() {
		System.out.println("20 inch");
	}
	void feature() {
		System.out.println("4*4 drive");
	}
}
