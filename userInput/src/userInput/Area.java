package userInput;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		float base = sc.nextFloat();
		System.out.println("Enter the height of the triangle");
		float height = sc.nextFloat();
		double res = findAreaTriangle(base,height);
		System.out.println("area of the triangle is :"+res);
		System.out.println("Enter the length of the square");
		double l = sc.nextDouble();
		double area = findAreaSquare(l);
		System.out.println("the area of the square is :"+ area);
		System.out.println("Enter the length of the rectangle");
		double le= sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double b = sc.nextDouble();
		double a1 = findAreaRectangle(le,b);
		System.out.println("Area of Rectangle is :"+a1);
		System.out.println("Enter the Radius of the circle");
		double r = sc.nextDouble();
		double res1 = findAreaCircle(r);
		System.out.println("The area of the circle is :"+res1);
		sc.close();
		
		
	}
	static double findAreaTriangle(float base,float height) {
		double res=  0.5 * base*  height;
		return res;

}
	static double findAreaSquare(double l) {
		double res = l*l;
		return res;
	}
	static double findAreaRectangle(double le,double b) {
		double res = le*b;
		return res;
		
	}
	static double findAreaCircle(double r) {
		double res = 3.14*r*r;
		return res;
	}
	
}
