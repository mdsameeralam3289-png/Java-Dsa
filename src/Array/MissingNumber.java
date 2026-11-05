package Array;

public class MissingNumber {
   public  static void main(String[] args) {

       int []arr = {1,2,3,5,6,7,};

       int n = arr.length+1;
       int TotalSum = n*(n+1)/2;
       int sum =0;

       for(int i=0; i<arr.length; i++){
           sum = sum+arr[i];
       }
        int missing = TotalSum-sum;
       System.out.println("Missing Element : "+ missing);
    }
}
