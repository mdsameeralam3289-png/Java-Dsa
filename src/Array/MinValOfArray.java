package Array;

public class MinValOfArray {
  public  static void main(String[] args) {

        int[]arr= {10,15,2,-8,25,16};

        int min =Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }

}

