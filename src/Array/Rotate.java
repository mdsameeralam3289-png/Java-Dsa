
package Array;

import static java.util.Collections.reverse;

public class Rotate {
    public static void main(String[] args) {

        int[] arr = {6,8,1,2,4,9,0};
        int n = arr.length;
        int d=3;
        d=d%n;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        int i=0;
        while(i<n){
            System.out.println(arr[i]+ " ");
            i++;
        }



        }

    private static void reverse(int[] arr, int i, int j) {
    }
}

