package if_else;

import java.util.Scanner;

public class evenOdd {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = Sc.nextInt();
        if(n%2==0){
            System.out.println("Even Number ");
            System.out.println("Sameer ");
        }

        else {
            System.out.println("Odd Number");
            System.out.println("sonu");
        }
    }
}
