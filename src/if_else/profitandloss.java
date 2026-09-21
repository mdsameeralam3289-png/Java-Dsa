//package if_else;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class profitandloss {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter CP : ");
//        int cp = sc.nextInt();
//        System.out.print("Enter SP : ");
//        int sp = sc.nextInt();
//
//        if(sp>cp) System.out.println("Profit is " + (sp-cp));
//        else if(cp>sp) System.out.println("Loss is " + (cp-sp));
//        else  System.out.println("No profit No loss");
//
//
//
//    }
//}

package if_else;
import java.util.Scanner;
public class profitandloss{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int CP = sc.nextInt();
        System.out.print("Enter SP :");
        int SP = sc.nextInt();

        if (SP > CP ) System.out.print("Profit " +(SP-CP));
        else if (CP >SP) System.out.print("Loss" +(CP-SP));
        else System.out.print("No profit No loss");
    }
}