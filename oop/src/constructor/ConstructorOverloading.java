package constructor;

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt s = new Studentt();
		s.roll = 77;
		s.name = "Jeevan J";
		s.intro();
		Studentt s1 = new Studentt(76,"Akash");
		
		s1.intro();

	}

}
class Studentt {
	int roll;
	String name;
	Studentt(){
		System.out.println("Default constructor");
	}
	Studentt(int roll,String name) {
		System.out.println("Parameterized constructor");
		this.roll = roll;
		this.name = name ;
	}
	void intro() {
		System.out.println("Roll: " + roll);
		System.out.println("Name: " + name);
	}
}
