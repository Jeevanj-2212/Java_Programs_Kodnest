package userInput;

import java.util.Scanner;

public class AreaType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		findAreaTriangle();
		
		
		 findAreaSquare();
		
		
		 findAreaRectangle();
		
		
		findAreaCircle();
		
	
		
		
	}
	static void findAreaTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		double base = sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		double height = sc.nextFloat();
		double res=  0.5 * base*  height;
		System.out.println("area of the triangle is :"+res);

}
	static void findAreaSquare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square");
		double l = sc.nextDouble();
		double res = l*l;
		System.out.println("the area of the square is :"+ res);
	}
	static void findAreaRectangle() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double le= sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double b = sc.nextDouble();
		double res = le*b;
		System.out.println("Area of Rectangle is :"+res);
		
		
	}
	static void findAreaCircle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of the circle");
		double r = sc.nextDouble();
		double res = 3.14*r*r;
		System.out.println("The area of the circle is :"+res);
		
	}
}
	

