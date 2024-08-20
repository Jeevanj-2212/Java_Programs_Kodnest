package section1;

import java.util.Scanner;

public class TwoDarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline character
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        sc.nextLine(); // consume newline character

        String name[][] = new String[n][m];
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                name[i][j] = sc.nextLine();
            }
        }
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                System.out.println(name[i][j]);
            }
        }
    }
}
