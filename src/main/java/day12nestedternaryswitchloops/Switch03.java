package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("2 sayi fgiriniz");
      double a=  input.nextDouble();
      double b=  input.nextDouble();

        System.out.println("Lutfen yapacaginiz islemi seciniz(+,-,*, / )");

       char opr= input.next().charAt(0);

       switch (opr){
           case '+':
               System.out.println(a+" + "+b+" ="+(a+b));
                break;
           case '-':
               System.out.println(a+" - "+b+" ="+(a-b));
                break;
            case '*':
               System.out.println(a+" * "+b+" ="+(a*b));
               break;
            case '/':
               System.out.println(a+" /"+b+ " ="+(a/b));
               break;
           default:
               System.out.println("Gecerli bir islem giriniz");
       }
                    double  sonuc = 0;
            switch (opr){

                case '+':
                    sonuc=  (a+b);
                    break;
                case '-':
                    sonuc=(a-b);
                    break;
                case '*':
                    sonuc=a*b;
                    break;
                case '/' :
                    sonuc=a/b;
            }
        System.out.println(sonuc);

    }}