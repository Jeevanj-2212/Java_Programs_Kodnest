package numberManipulation;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        
        int gcd = findGcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
        
        sc.close(); 
    }

    public static int findGcd(int a, int b) {
        while (b != 0) {
            int rem = a % b; 
            a = b;           
            b = rem;        
        }
        return a;
    }
}
