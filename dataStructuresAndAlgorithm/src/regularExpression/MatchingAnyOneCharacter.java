package regularExpression;

import java.util.Scanner;

public class MatchingAnyOneCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Scanner sc  = new Scanner(System.in);
				//The next character after a can be either a or b or c not anything except this letters
				String str= "^a.+[abc]$";
				
				String st =sc.nextLine();
				if(st.matches(str)) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}


			}
		


			

	}


