package regularExpression;

import java.util.Scanner;

public class QuantifierforLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		//input should start with hello,in between atleast 'n'character should be there here n is 2 maximum  4 characters  and ends with world
		String str= "^hello.{2,4}world$";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}


	}

}
