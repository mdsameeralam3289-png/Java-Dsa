package Pattern_Printing;
import java.util.Scanner;

public class StarRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=1; i<=row ; i++){ // kitne line hoge
            for(int j=1; j<=col; j++){ // har line me kitna star hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
