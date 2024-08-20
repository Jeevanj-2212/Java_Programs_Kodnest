package loops;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			System.out.print(" ");
			for(int j= 4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{ 
				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
			
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=11;j++)
				if (((i == 3 ||i==4||i==5) && (j >= 4 && j <= 8))) {

					System.out.print(" ");
				}
				else
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		

	}

}
