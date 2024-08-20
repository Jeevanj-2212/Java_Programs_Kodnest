package loops;

public class ForLoop {
	public static void main(String args[]) {
		int count =0;
		for (int i =1;i<=3;i++) {
			for (int j= 1;j<=2;j++) {
				for (int k =1;k<=3;k++) {
					count++;
					System.out.println( count + ":" +i +" "+j+" "+k);
				}
			}
		}
	}

}
