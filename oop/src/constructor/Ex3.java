package constructor;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Smartphone1();
		new Smartphone1("OppO");
		//new Phone1();

	}

}
class Phone1 {
	Phone1() {
		System.out.println("Phone 0-Parameter constructor");
	}
	Phone1(String s) {
		System.out.println("Phone 1-Parameter Constructor");
	}
}
class Smartphone1 extends Phone1 {
	Smartphone1(){
		
		System.out.println("SmartPhone 0-parameter");
	}
	Smartphone1(String s){
		System.out.println("Smartphone 1-parameter");
	}
}
