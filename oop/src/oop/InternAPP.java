package oop;

public class InternAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intern i= new Intern();
		i.name="Jeevan";
		i.nativ="Karkala";
		i.age=22;
		System.out.println("Name "+i.name);
		System.out.println("Native "+i.nativ);
		System.out.println("Age "+i.age);
		i.study();
		i.giveInterview();

	}

}
class Intern{
	String name;
	String nativ;
	int age ;
	void study(){
		System.out.println("Study java");
	}
	void giveInterview(){
		System.out.println("Give interviews");
	}
	
}
