package regularExpression;

import java.util.Scanner;

public class QuantifierNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//input should start with hello,in between only 'n'character should be there here n is 3   and ends with world
		String str= "^hello.{3}world$";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		



	}

}