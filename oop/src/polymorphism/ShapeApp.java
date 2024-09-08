package polymorphism;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s  = new Circle(1.55);
		 s.getArea();
		 s = new Rectangle(2.5,3.0);
		 s.getArea();
		 s = new Triangle(2.5,3.0);
		 s.getArea();
		 

	}

}
class Shape {
	void getArea() {
		System.out.println("enter area with one parameter atleast");
	}
}
class Circle extends Shape{
   double r ;
	Circle(double r){
		this.r = r;
		
	}
	void getArea() {
		System.out.println("The area of the circle is "+ (3.14*r*r));
	}
}
class Rectangle extends Shape {
	double width;
	double height;
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	void getArea() {
		System.out.println("The area of the rectangle is " + (width*height));
	}
}
class Triangle extends Shape {
	double base;
	double height;
	Triangle(double base,double height) {
		this.base = base;
		this.height = height;
	}
	void getArea() {
		System.out.println("The area of triangle is " + (0.5*base*height));
	}
}