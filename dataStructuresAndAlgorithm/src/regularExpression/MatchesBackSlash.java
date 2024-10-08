package regularExpression;

import java.util.Scanner;

public class MatchesBackSlash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Matches only back slash
		 String str= "\\\\";
			
			String st =sc.nextLine();
			if(st.matches(str)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}




	}

}
