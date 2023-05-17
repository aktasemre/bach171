package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
        //Ternary Statement
        //Ornek 1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin, degil ise "Kucuk degil" yazdirin
        //----------if else cozumu--------
        int num = 12;

        if (num < 10) {
            System.out.println("Kucuk");
        } else {
            System.out.println("Kucuk degil");
        }

        //-------Ternary Cozumu------
        //  Conditon    ?   Condition true ise calisir  :   Condition falsi ise calisir ;
        String sonuc = num < 10 ? "Kucuk" : "Kucuk degil";
        System.out.println(sonuc);

        //Ornek 2: Sayi cift ise console a "cift", tek ise "Tek" yazdirin
        //----------if else cozumu--------
        int k = 13;

        if (k % 2 == 0) {
            System.out.println("cift");
        } else {
            System.out.println("tek");
        }

        //----------Ternary cozumu--------
        String result = k % 2 == 0 ? "cift" : "tek";
        System.out.println(result);

        //Ornek 3: Sayi 0 dan buyukse pozitif degilse ekrana pozitif degil yazdirin
        int a=-5;
        System.out.println( a>0 ? "pozitiftir" : "pozitif degil");

        Scanner input= new Scanner(System.in);
        System.out.println("iki sayi ver");
         double firs=input.nextDouble();
            double second=input.nextDouble();

          double  result2=firs<second ? firs:second;

        System.out.println(result2);

    }
}