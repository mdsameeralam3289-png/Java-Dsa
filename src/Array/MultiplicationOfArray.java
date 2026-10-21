package Array;

public class MultiplicationOfArray {
   public  static void main(String[] args) {
       int[]arr={10,5,2};
       int product = 1;
       for(int i=0; i<arr.length;i++){
           product*=arr[i];
       }
       System.out.print(product);
    }
}
