package if_else;
import java.util.Scanner;

public class FourDigit_Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int Num = sc.nextInt();
        if(Num >999 && Num<10000)
            System.out.println("Four digit number ");
        else System.out.println("Not four digit number ");

        }

    }


