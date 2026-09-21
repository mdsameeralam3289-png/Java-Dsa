package Basic;

import java.util.Scanner;

public class TakingInputFormUser {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radious : ");
        double r = sc.nextDouble();

        double a = 3.14*r*r;
        System.out.println(a);

    }
}