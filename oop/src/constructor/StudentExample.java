package constructor;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Jeevan", "cs", 2024,"blr");
		s.introduce();
		Student s1 = new Student(2,"Karthik", "IS", 2024,"mys");
		s1.introduce();
		

	}

}
class Student {
	int roll;
	String name;
	String branch;
	int yop;
	String city;
	public Student(int r,String n,String b,int y,String c) {
		roll = r;
		name = n;
		branch = b;
		yop = y;
		city = c;
	}
	void introduce(){
		System.out.println("Roll Number: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Branch: " + branch);
		System.out.println("YOP: " + yop);
		System.out.println("City: " + city);
	}
}