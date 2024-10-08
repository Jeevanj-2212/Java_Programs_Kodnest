package regularExpression;

import java.util.Scanner;

public class NegativeLookBehind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 String str= "(?<!b)a";
			
			String st =sc.nextLine();
			if(st.matches(".*"+str+ ".*")) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}

	}

}
