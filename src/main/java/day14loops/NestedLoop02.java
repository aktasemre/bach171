package day14loops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Once Sutun Sonra satir sayisini giriniz");

     int  satir= input.nextInt();
        int  sutun= input.nextInt();

        for (int i =0 ; i <sutun ; i++) {

            for (int j = 0; j <satir ; j++) {

                System.out.print(" x ");

            }
            System.out.println();
        }


    }
}
