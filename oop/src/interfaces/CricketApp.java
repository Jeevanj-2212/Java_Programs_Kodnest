package interfaces;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer c = new Cricketer();
		acess(c);
		

	}
	public static void acess(Keeper k) {
		k.batting();
		k.keep();
	}

}
interface Batsman {
	void batting(); 
}
interface Keeper extends Batsman {
	void keep();
}
class Cricketer implements Keeper {

	@Override
	public void batting() {
		// TODO Auto-generated method stub
		System.out.println("Bat well");
		
	}

	@Override
	public void keep() {
		// TODO Auto-generated method stub
		System.out.println("Keep wickets");
		
	}
	
}