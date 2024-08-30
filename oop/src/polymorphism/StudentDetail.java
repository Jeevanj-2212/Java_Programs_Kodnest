package polymorphism;

public class StudentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		accessStudent(s1);
		accessStudent(s2);
		accessStudent(s3);
		

	}
	public static void accessStudent(Student s) {
		s.learn();
		s.enjoy();
		s.sleep();
		s.eat();
	}

}
class Student {
	void learn() {
		System.out.println("Student is learning");
	}
	void enjoy() {
		System.out.println("Student is enjoying");
	}
	void sleep() {
		System.out.println("Student is Sleeping");
	}
	void eat() {
		System.out.println("student is eating");
	}
}
