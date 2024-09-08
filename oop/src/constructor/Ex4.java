package constructor;



public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Smartphone2();
		new Smartphone2("OppO");
		//new Phone1();

	}

}
class Phone2 {
	Phone2() {
		System.out.println("Phone 0-Parameter constructor");
	}
	Phone2(String s) {
		System.out.println("Phone 1-Parameter Constructor");
	}
}
class Smartphone2 extends Phone2 {
	Smartphone2(){
		super("Java");
		System.out.println("SmartPhone 0-parameter");
	}
	Smartphone2(String s){
		System.out.println("Smartphone 1-parameter");
	}
}

