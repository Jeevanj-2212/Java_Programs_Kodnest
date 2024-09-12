package encapsulation;

public class StudentEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Student s = new Student();
		s.setRoll(1);
		System.out.println("Roll Number is: " + s.getRoll());
		s.setName("Jeevan J");
		System.out.println("Name is: " + s.getName());
		s.setBranch("CS");
		System.out.println("Branch is: " + s.getBranch());

	}

}
class Student {
	private int roll;
	private String name;
	private String branch;
	public void setRoll(int roll){
		//Setters
		this.roll = roll;
		
	}
	//Getters
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch() {
		return branch;
	}
}
