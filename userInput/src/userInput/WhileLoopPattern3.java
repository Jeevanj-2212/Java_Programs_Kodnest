package userInput;

public class WhileLoopPattern3 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(i>=j) {
				System.out.print("*");
				j++;
				
			}
			
			System.out.println();
			i++;
		}
	}

}
