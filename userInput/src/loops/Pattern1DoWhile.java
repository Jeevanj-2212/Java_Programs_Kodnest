package loops;

public class Pattern1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int j =1;
			do {
				System.out.print("*");
				j++;
			}while(j<=i);
			int k = i+1;
			do {
				System.out.print("@");
				k++;
			}while(k<=6);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
