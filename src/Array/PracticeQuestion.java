package Array;

import java.util.Scanner;

public class PracticeQuestion {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] karan = new int[7];

            for (int i = 0; i < 7; i++) {
                karan[i] = sc.nextInt();
            }
            for (int i = 0; i < 7; i++) {
                if (karan[i] <0) System.out.print(karan[i] + " ");
            }
        }
    }

