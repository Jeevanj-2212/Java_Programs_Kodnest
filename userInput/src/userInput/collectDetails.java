package userInput;

import java.util.Scanner;

public class collectDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user id ");
		byte useId= sc.nextByte();
		System.out.println("Enter your age");
		short age = sc.nextShort();
		System.out.println("Enter your Phone number");
		int ph = sc.nextInt();
		System.out.println("Enter yor Nation id ");
		long na= sc.nextLong();
		System.out.println("Enter your height");
		float height = sc.nextFloat();
		System.out.println("Enter your weight");
		double weight = sc.nextDouble();
		System.out.println("Are you married?(true/false)");
		boolean marriage = sc.nextBoolean();
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Your user id is "+useId+"\n Your Age is "+age+ "\n your Phone Number is "+ph+"\nYour national id is "
				+na+"\n your height is "+height+"\nyour weight is "+weight+"\nAre you married "+marriage+
				"\nyour Name is "+name);

	}

}
