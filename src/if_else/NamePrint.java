package if_else;
import java.util.Scanner;

public class NamePrint {
    public static  void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        if(n%5==0 && n%3==0) System.out.println("Riya");
        else if(n%5==0) System.out.println("Sam");
        else if(n%3==0) System.out.println("Sonu");

        else  System.out.println("Raj");


    }
}
