package regularExpression;

import java.util.Scanner;

public class MatchingWhitespaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//The next character after a there can be any whitespaces 
          String str= "a\\s *";
		
		String st =sc.nextLine();
		if(st.matches(str)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
