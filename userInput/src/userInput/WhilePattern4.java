package userInput;

public class WhilePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
