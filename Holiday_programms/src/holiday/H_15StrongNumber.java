package holiday;

import java.util.Scanner;

public class H_15StrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int originalNumber = n;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            
            sum += factorial;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number");
        } else {
            System.out.println(originalNumber + " is not a Strong number");
        }

       
    }
}
