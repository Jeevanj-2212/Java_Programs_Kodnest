package polymorphism;

public class ClassroomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Mentor m = new Mentor();
		m.trainIntern();
		m.takeAttendence();*/
		JavaMentor j= new JavaMentor();
		SqlMentor s = new SqlMentor();
		HtmlMentor h = new HtmlMentor();
		ClassroomApp obj = new ClassroomApp();
		obj.accessMentor(j);
		obj.accessMentor(s);
		obj.accessMentor(h);
		
		

	}
	public void accessMentor(Mentor m) {
		m.trainIntern();
		m.takeAttendence();
	}

}
abstract class Mentor {
	abstract void trainIntern();
	abstract void takeAttendence() ;
	
}
class JavaMentor extends Mentor{
	void trainIntern() {
		System.out.println("Java Mentor is training");
	}
	void takeAttendence() {
		System.out.println("Java Mentor is taking attendence");
	}
}
class SqlMentor extends Mentor{
	void trainIntern() {
		System.out.println("SQL Mentor is training");
	}
	void takeAttendence() {
		System.out.println("SQL Mentor is taking attendence");
	}
}
class HtmlMentor extends Mentor{
	void trainIntern() {
		System.out.println("Html Mentor is training");
	}
	void takeAttendence() {
		System.out.println("Html Mentor is taking attendence");
	}
}
