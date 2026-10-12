package Array;
import java.util.Scanner;
public class PrintingNegativeValue {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter size of array:  ");
       int n = sc.nextInt();
       int[]array = new int[n];
       System.out.print("Enter array element :  ");
       for(int i=0; i<n; i++){
           array[i] = sc.nextInt();
       }
       for(int i=0; i<n; i++){
           if(array[i]<0) System.out.print(array[i]+" ");
       }


    }

}
