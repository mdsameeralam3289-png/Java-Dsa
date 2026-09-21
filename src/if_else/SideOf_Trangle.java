package if_else;
import java.util.Scanner;

public class SideOf_Trangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b)
            System.out.println("valid triangle side ");
        else
            System.out.println("Not valid");
        }
    }

