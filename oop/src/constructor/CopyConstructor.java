package constructor;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lecture l1 = new Lecture("A2", "deep", "java");
		l1.display();
		Lecture l2 = new Lecture(l1);
		l2.tech = "sq1";
		l2.display();
		l1.display();
		

	}

}
class Lecture {
	String classroom;
	String mentor;
	String tech;
	public Lecture(String classroom, String mentor, String tech) {
		super();
		this.classroom = classroom;
		this.mentor = mentor;
		this.tech = tech;
	}
	public Lecture(Lecture l) {
		this.classroom = l.classroom;
		this.mentor = l.mentor;
		this.tech = l.tech;
	}
	public void display() {
		System.out.println(classroom);
		System.out.println(mentor);
		System.out.println(tech);
	}
}
