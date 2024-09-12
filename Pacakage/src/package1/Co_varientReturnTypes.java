package package1;

public class Co_varientReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KodnestEdTech k1 = new KodnestEdTech();
		k1.trainFresher();

	}

}
class Fresher {
	void prepare() {
		System.out.println("Fresher method");
	}
}

class KodnestFresher extends Fresher {
	void prepare() {
		System.out.println("Kodnest method");
	}
}

class EdTech {
	 Fresher trainFresher() {
		 System.out.println("Edtech method");
		 Fresher f = new Fresher();
		 return  f;
		
	}
}

class KodnestEdTech extends EdTech {
	KodnestFresher trainFresher() {
		System.out.println("Kodnest Edtech method");
		KodnestFresher k = new KodnestFresher();
		return k;
	}
}