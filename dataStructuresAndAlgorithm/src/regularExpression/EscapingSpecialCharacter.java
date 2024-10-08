package regularExpression;

import java.util.Scanner;

public class EscapingSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Matches only a
		 String str= "a\\b";
			
			String st =sc.nextLine();
			if(st.matches(str)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}



	}

}
