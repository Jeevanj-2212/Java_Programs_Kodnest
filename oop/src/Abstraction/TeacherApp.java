package Abstraction;



public class TeacherApp {
	public static void main(String[] args) {
		Teacher t;
		t=new JavaTeacher();
		accessTeacher(t);
		t = new PythonTeacher();
		accessTeacher(t);
		
	}
	
	public static void accessTeacher(Teacher t) {
		t.markAttendence();
		t.teach();
	}
}
 abstract class  Teacher {

    abstract void markAttendence();
    abstract void teach();
	     
}
 
class JavaTeacher extends Teacher {

	@Override
	void markAttendence() {
		// TODO Auto-generated method stub
		System.out.println("Java Teacher is Taking attendance");
		
	}

	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("Java Teacher is Teaching");
	}
	
}

class PythonTeacher extends Teacher {

	@Override
	void markAttendence() {
		// TODO Auto-generated method stub
		System.out.println("Python Teacher is taking attendance");
		
	}

	@Override
	void teach() {
		// TODO Auto-generated method stub
		System.out.println("Python Teacher is Teaching python");
		
	}
	
}