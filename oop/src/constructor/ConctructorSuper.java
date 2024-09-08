package constructor;

public class ConctructorSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chil c = new Chil();

	}

}
class Par {
	Par(){
		System.out.println("Parent constructor");
	}
}
class Chil extends Par {
	Chil() {
		super();
		System.out.println("Child constructor");
	}
}
