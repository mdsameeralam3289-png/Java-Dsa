package if_else;

import java.util.Scanner;

public class DivisibleBY03_OR_5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = sc.nextInt();
        if(N%5==0 ||N%3==0 )
            System.out.println("Divisible by 3 or 5 ");
        else
            System.out.println("Not divisible by 3 or 5 ");


    }
}
