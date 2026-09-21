package Basic;

import java.util.Scanner;

public class SimpleIntrest {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter P : ");
        double P = Sc.nextDouble();
        System.out.print("Enter R : ");
        double R = Sc.nextDouble();
        System.out.print("Enter T : ");
        double T = Sc.nextDouble();
        System.out.print(" SI is : ");
        double Si = (P*R*T)/100;
        System.out.println(Si);
        double Total = P+Si;
        System.out.print("Total amount is : ");
        System.out.println(Total);
        System.out.println("Profit % = " +(Total-P)/P *100);
    }
}
