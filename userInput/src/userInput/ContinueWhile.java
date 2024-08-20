package userInput;



public class ContinueWhile {
	public static void main(String[] args) {
		int i =1;
		
		while(i<=8) {
			if (i==6) {
				System.out.println("Skip");
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
