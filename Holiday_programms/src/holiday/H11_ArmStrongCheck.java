package holiday;

import java.util.Scanner;

public class H11_ArmStrongCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number of the range:");
        int s = sc.nextInt();
        System.out.println("Enter the ending number of the range:");
        int e = sc.nextInt();

        System.out.println("Armstrong numbers in the range are:");
        for (int i = s; i <= e; i++) {
            int number = i;
            int digits = 0;
            int sum = 0;

            
            int temp = number;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = number;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
