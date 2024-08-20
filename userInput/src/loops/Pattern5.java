package loops;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j =1;j<=i;j++) {
				if((i==4&&j==2)||(i==4&&j==3)||(i==3&&j==2)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
