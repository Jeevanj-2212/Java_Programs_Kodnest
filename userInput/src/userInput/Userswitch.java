package userInput;

import java.util.Scanner;

public class Userswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int choice = sc.nextInt();
		switch(choice) {
		// you can also use case 1,2,3
		case 1 : case 2: case 3: System.out.println("Grade: A");
		break;
		case 4:  case 5: System.out.println("Grade: B");
		break;
		case 6 : System.out.println("Grade: C");
		break;
		case 7: System.out.println("Grade: D");
		break;
		default :
			System.out.println("invalid");
		}

	}
	/* switch(n)
	{
	case 10,11,20: Sysout("Grade: A");	
	break;
	case 23,26: Sysout("Grade: B");	
	break;
	case 35,4: Sysout("Grade: c");	
	break;
	default:Sysout("Inavalid");
	}*/

}
