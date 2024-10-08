package regularExpression;

import java.util.Scanner;

public class Quantifierzmultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				Scanner sc  = new Scanner(System.in);
				//input should start with hello,in between any number of characters ends with world
				String str= "^hello.*world$";
				String st =sc.nextLine();
				if(st.matches(str)) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
				

			}

		}


	


