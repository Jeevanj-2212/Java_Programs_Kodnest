package polymorphism;

import java.util.Scanner;

public class EmployeeBonusSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your role: ");
		String role = sc.nextLine();
		role = role.toLowerCase();
		System.out.println("enter your Salary");
		int salary = sc.nextInt();
		Employee e;
		switch(role) {
		case "manager":
			 e =new Manager(role,salary);
			e.calculateBonus();
			break;
		case "developer":
		                 e=new Developer(role,salary);
		                e.calculateBonus();
		                break;
		case "intern": e =new Intern(role,salary);
                       e.calculateBonus();
                       break;
	    default:System.out.println("Invalid role");
		
		}
		

	}

}
class Employee {
	void calculateBonus() {
		System.out.println("Enter the role and salary");
	}
}
class Manager extends Employee {
	String role;
	int salary;
	Manager(String role,int salary){
		this.role = role;
		this.salary = salary;
	}
	void calculateBonus() {
		double inc = 0.3*salary;
		System.out.println("Hello " + role + " your increment "+ inc + ", now your total salary is: " + (inc+salary));
	}
}
class Developer extends Employee {
	String role;
	int salary;
	Developer(String role,int salary){
		this.role = role;
		this.salary = salary;
	}
	void calculateBonus() {
		double inc = 0.2*salary;
		System.out.println("Hello " + role +" your increment "+ inc + ", now your total salary is: " + (inc+salary));
	}
}
class Intern extends Employee {
	String role;
	int salary;
	Intern(String role,int salary){
		this.role = role;
		this.salary = salary;
	}
	void calculateBonus() {
	 double inc = 500;
		System.out.println("Hello " + role + " your increment is " + inc + ", now your total Salary is: " + (inc +salary));
	}
}