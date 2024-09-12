package polymorphism;

public class ApplianceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appliance a ;
		a = new WashingMachine();
		new ApplianceApp().acess(a);
		a = new Refrigerator();
		new ApplianceApp().acess(a);
		
		

	}
	public void acess(Appliance a ) {
		a.turnOn();
		a.turnOff();
	}
	

}
abstract class Appliance{
	abstract void turnOn();
	abstract void turnOff();
}

class WashingMachine extends Appliance {
	void turnOn() {
		System.out.println("Washing machine is ON");
	}
	void turnOff() {
		System.out.println("Washing machine is OFF");
	}
}
class Refrigerator extends Appliance{

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Refrigerator is ON");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Refrigerator is OFF");
	} 
}
	

	

