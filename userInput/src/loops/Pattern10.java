package loops;
import java.util.Scanner;


public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        for (int i = 1; i <= 5; i++) {
            int a = 1;
            int b = 1; 
            for (int j = 0; j < i; j++) {
                System.out.print(a + " ");
                if (j < i - 1) { 
                    a = b + (j + 1);
                    b = a;
                }
            }
            System.out.println(); 
        }
        
    }
}
