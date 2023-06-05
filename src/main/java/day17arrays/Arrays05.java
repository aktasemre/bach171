package day17arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
boolean c[]=new boolean[4];
        System.out.println(Arrays.toString(c));
        int a[]={0, 2, 3, 0, 12, 0};
 int b[]=new int[a.length];
  int i=0;
        for (int w:a     ) {
            if (w!=0){
                b[i]=w;
           i++; }

        }

        System.out.println(Arrays.toString(b));
    }
}