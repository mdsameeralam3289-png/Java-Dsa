package if_else;
import java.util.Scanner;
public class IsInteger {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double n = Sc.nextDouble();
        int x = (int)n;
        if (n-x ==0) System.out.println("Is integer");
        else System.out.println("not integer");
 }
        
}
