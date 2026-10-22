package Array;

public class LinearSearch {
    public static void main() {
        int []arr={10,15,18,74,85};
        int target=15;
        boolean flage=false;
        for(int i=0; i<arr.length;i++){
           if(arr[i]==target) {
               flage=true;
               break;
           }
        }
        if(flage==true) System.out.println("Targe exists in Array ");
        else System.out.println(" Target is missing in Array ");
    }
}
