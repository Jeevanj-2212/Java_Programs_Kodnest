package deadlock;

public class KurukshetraApp {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Thread t1 = new Thread(warrior);
		Thread t2 = new Thread(warrior);
		
		t1.setName("Arjuna");
		t2.setName("Karna");
		
		t1.start();
		t2.start();
		

	}

}
