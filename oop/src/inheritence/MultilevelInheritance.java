package inheritence;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports c ;
		c=new Sports();
		c.output();
		c = new Foot();
		c.output();
		
		
	}

}
class Sports {
	void output() {
		System.out.println("i love sports");
	}
}
class Cric extends Sports {
	void out() {
		System.out.println("i love cricket");
	}
	void output() {
		System.out.println("Cricket");
	}
}
class Foot extends Cric {
	void oo() {
		System.out.println("I love FootBall");
	}
	
}
