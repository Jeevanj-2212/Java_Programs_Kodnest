package lambdaExpression;
interface Greeter {
	void greet(String a);
	
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In lambda expression if we dont provide datatype it is going to work;
		Greeter g1 =(a)-> System.out.println("hello " + a);
		g1.greet("Jeevan");

	}

}
