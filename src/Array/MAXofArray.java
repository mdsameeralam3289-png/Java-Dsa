package Array;

public class MAXofArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 2, 10};
        int max =arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max) max= arr[i];
        }
        System.out.println(max);
    }
}