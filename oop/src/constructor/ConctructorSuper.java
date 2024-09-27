package constructor;

public class ConctructorSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chil c = new Chil();

	}

}
class Par {
	Par(){
		System.out.println("Parent constructor constructer of parent class");
	}
}
class Chil extends Par {
	Chil() {
		super();
		System.out.println("Child constructor");
	}
}
