package loops;

public class Pattern1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		while(i<=5) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			int k = i+1;
			while(k<=6) {
				System.out.print("@");
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
