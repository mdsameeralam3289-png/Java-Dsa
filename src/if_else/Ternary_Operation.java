package if_else;
import java.util.Scanner;
public class Ternary_Operation {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();

        System.out.println((n%2==0) ? "Even ": "odd");


    }
}
