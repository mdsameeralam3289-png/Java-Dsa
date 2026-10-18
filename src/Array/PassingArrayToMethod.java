package Array;

import org.w3c.dom.ls.LSOutput;

public class PassingArrayToMethod {
    public static void main(String[] args) {
//        int x[] = {10, 3, 29, 38};
//        System.out.println(x[2]);
//        change(x);
//        System.out.println(x[2]);
//    }
//    public static void change(int []x){
//        x[2]=92;

        int []x ={10,20,30,40,50};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
        public static void change(int[]x){
        x[2]=90;
        }
    }

