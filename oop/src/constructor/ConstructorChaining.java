package constructor;

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d= new Demo();

	}

}
class Demo {
	Demo(){
		this("Java");
		System.out.println("0-parameter constructor");	
	}
	Demo(String s){
		this(5,10);
		System.out.println("1-parameter constructor");
	}
	Demo(int a, int b) {
		System.out.println("2-parameter constructor");
	}
}
