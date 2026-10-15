package Array;

public class MAXofArray {
    public static void main(String[] args) {
        int[] arr = {-5, 10, 15, 20, 45, 60, -85};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        System.out.println(max);
    }

}