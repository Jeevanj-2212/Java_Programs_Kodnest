package userInput;

public class DoWhilePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(j);
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
