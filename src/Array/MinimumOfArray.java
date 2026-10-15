package Array;

public class MinimumOfArray {
    static void main(String[] args) {
        int [] arr= {-8,10,20,15,-15,-70};
        int min= arr[0];
        for (int i=0; i<arr.length; i++ ){
            if(arr[i]<min) min=arr[i];

        }
        System.out.println(min);
    }
}
