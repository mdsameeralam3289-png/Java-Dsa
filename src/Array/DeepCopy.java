package Array;
import java.util.Arrays;
public class DeepCopy {
    static void main(String[] args) {
        int[]arr= {10,20,30,40};
        int[]deep;
        deep = Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(deep[0]);
        System.out.println(arr[0]);
    }

}
