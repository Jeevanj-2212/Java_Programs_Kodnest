package staticConcepts;



class Circle{
	double r;
	static double pi =3.14;
	public void findArea() {
		System.out.println("Area = "+(pi*r*r));
	}
}

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		Circle c= new Circle();
		c.r=10;
		c.findArea();
		Circle c1 = new Circle();
		c1.r=100;
		c1.findArea();
		Circle c2 = new Circle();
		c2.r = 1000;
		c2.findArea();

	}

}
