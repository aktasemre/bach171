package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Istediginiz carpim tablosunun giriniz :");
        int   a= input.nextInt();
        int i=1;

        while (i<11){
          int carp= a*i;
            System.out.println(a +"x"+i+" ="+carp);
       i++; }
    }
}
