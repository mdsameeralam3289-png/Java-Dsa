package Array;

import java.util.Arrays;

import static Arrays.ProductOfArray.print;

public class SortArrayBuiltIn {
    static void main(String[] args) {
        int[] arr = {10, 20, 8, 6, -8, 10, 12};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[]arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}