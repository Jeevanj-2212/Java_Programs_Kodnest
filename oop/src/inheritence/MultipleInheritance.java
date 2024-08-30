package inheritence;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer s= new Singer();
		s.hobby = "Singing";
		s.hobby();
		Painter p = new Painter();
		p.hobby = "Painting";
		p.hobby();

	}

}
class Artist {
	String hobby;
}
class Painter extends Artist{
	void hobby () {
		System.out.println("My hobby is "+ hobby);
	}
}
class Singer extends Artist {
	void hobby() {
		System.out.println("My hobby is "+hobby);
	}
}
/*class Student extends Painter{
	void hobby() {
		System.out.println("My hobby is "+hobby);
	}
	
}
class Student extends Singer {
	void hobby() {
		System.out.println("My hobby is "+hobby);
	}
	
}*/
