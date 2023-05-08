package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kisa ve uzun kenarlarini giriniz");
      int  kisa=input.nextInt();
      int uzun=input.nextInt();
        System.out.println("alan = " + alan(kisa, uzun));
        System.out.println("cevre = " + cevre(uzun, kisa));

    }
public static int alan(int a,int b){
        return a*b;
}
public static  int cevre(int c, int d){
        return 2*(c+d);
    }
}
