package kendisorularim;

import java.util.Scanner;

public class FaktoriyelTopla {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif iki tam sayi giriniz");

        int f1 = input.nextInt();
        int f2 = input.nextInt();
        if (f1 < 1 || f2 < 1) {

            boolean   dogru=true;//sonsuz dongu olustuemak icin
            while (dogru) {
                System.out.println("Hatalı giriş yaptınız Lütfen pozitif iki tam sayi giriniz");
                f1 = input.nextInt();//sayilar hatali ise if icinde yeni sayi aldirdik
               f2 = input.nextInt();
             dogru= f1 < 1 || f2 < 1;}
        }

        int top= faktoriyel(f1)+faktoriyel(f2);
            System.out.println(top);
            }

        public static int faktoriyel ( int a){//faktoriyelin metodunu yazdik
            int carp = 1;
            for (int i = 1; i < a + 1; i++) {
                carp *= i;
            }

            return carp;
        }
    }
