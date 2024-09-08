package constructor;



public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Smartphone3();
		new Smartphone3("OppO");
		//new Phone1();

	}

}
class Phone3 {
	Phone3() {
		this("JAVA");
		System.out.println("Phone 0-Parameter constructor");
	}
	Phone3(String s) {
		System.out.println("Phone 1-Parameter Constructor");
	}
}
class Smartphone3 extends Phone3 {
	Smartphone3(){
		this("Java");
		System.out.println("SmartPhone 0-parameter");
	}
	Smartphone3(String s){
		System.out.println("Smartphone 1-parameter");
	}
}


