package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        int nsp = 1;
        int nst = 2 * n - 3;

        for (int i = 1; i <= n - 1; i++) {

            // Spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp++;
            nst -= 2;

            System.out.println();
        }
    }
}