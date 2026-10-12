package Array;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class OutputInputArray {
    static void main(String[] args) {
//        int[] arr = {10,15,20,25,80,72};
//        for(int i=0; i<=5;i++ ){
//            System.out.print(arr[i]+ " ");
//
//        }
//        System.out.println(arr.length);
        Scanner sc =new Scanner(System.in);
        int[] karan=new int[7];
         //input
        for(int i=0; i<7; i++){
            karan[i]= sc.nextInt();

        }
        //print
        for(int i=0; i<7; i++){
            System.out.print(2*karan[i]+ " ");
        }
    }
}
