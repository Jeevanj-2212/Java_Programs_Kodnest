package lambdaExpression;
interface Greeter1 {
	String greet(String a);
	
}


public class LambdaWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter1 g1 =(a)-> "hello " + a;
		System.out.println(g1.greet("Jeevan"));

	}

}
