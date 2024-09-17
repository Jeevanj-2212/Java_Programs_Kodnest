package lambdaExpression;
interface Addition {
	void add();
}
interface Subtraction {
	void sub(int a,int b);
}
interface Multiplication {
	int mul();
}
interface Division {
	int divide(int a, int b);
}

public class LambdaExpressionFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Addition a = ()->System.out.println("Sum is: " + (10 + 5));
        a.add();
        Subtraction s = (x,y)->System.out.println("Diff: "+(x-y));
        s.sub(10, 20);
        Multiplication m =()-> 10*5;
        System.out.println("Multiplication: "+m.mul());
        Division d =(e,f)->e/f;
        System.out.println("Division is: "+d.divide(10, 5));
	}

}
