package userInput;

public class DoWhilePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int j =1;
			do {
				System.out.print(i);
				j++;
			}while(j<=4);
			System.out.println();
			i++;
		}while(i<=4);

	}

}
