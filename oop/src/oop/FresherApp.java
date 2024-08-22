package oop;

import java.util.Scanner;

class Fresher{
	String id;
	String name;
	String branch;
	int yop;
	void giveIntro() {
		System.out.println("ID: "+id);
		System.out.println("NAME: "+name);
		System.out.println("BRANCH: "+branch);
		System.out.println("YEAR OF PASSING: "+yop);
	}
}
public class FresherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fresher f= new Fresher();
		System.out.println("Enter your ID");
		f.id=sc.nextLine();
		System.out.println("Enter your Name");
		f.name = sc.nextLine();
		System.out.println("Enter your Branch");
		f.branch= sc.nextLine();
		System.out.println("Enter your Year of passing");
		f.yop = sc.nextInt();
		f.giveIntro();
	

	}

}
