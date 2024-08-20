package userInput;

public class DoWhileContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1; 
		do {
			if (i==6) {
				System.out.println("Skip");
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}while(i <= 8);

	}

}
