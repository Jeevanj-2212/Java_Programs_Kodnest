package loops;

public class Pattern9horseglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j =5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i =2;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k =1;k<=(2*i)-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
