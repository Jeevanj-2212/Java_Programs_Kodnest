package userInput;

public class WhileLoopPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		while(i >=1) {
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i--;
		}

	}

}
