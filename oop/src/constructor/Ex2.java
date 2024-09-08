package constructor;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SamsungPhone();

	}

}
class Phone {
	Phone() {
		System.out.println("Phone constructor");
	}
}
class  SmartPhone extends Phone {
	SmartPhone(){
		System.out.println("SmartPhone Constructor");
		
	}
}
class AndroidPhone extends SmartPhone {
	AndroidPhone(){
		System.out.println("AndroidPhone Constructor");
	}
}
class SamsungPhone extends AndroidPhone {
	SamsungPhone(){
		System.out.println("SamsungPhone Constructor");
	}
}
