package kendisorularim;

import java.util.Scanner;

public class fonkParabolVb {
    public static void main(String[] args) {


        //Interview soruları
        //Q01

  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz
   */

        //      Q02
        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String    str=  input.nextLine();
        System.out.println("str.indexOf(3,6) = " + str.indexOf(3, 6));
        System.out.println("kac defa tekrar etsin");
                 int number= input.nextInt();
                char a='a';
                char b='b';
             String  c="" +a+b;
           String str1=    str.substring(0,1);
            String str2=str.substring(str.length()-1);
        String strSon = strSon= str1+str2;

                String st1= String.valueOf(str.charAt(0));
                String st2= String.valueOf(str.charAt(str.length()-1));
               String s= st1+st2;
        System.out.println(s);
        for (int i = 0; i <number-1 ; i++) {

            strSon+=st1;
            strSon+= st2;

        }
        System.out.println(strSon);
        // Q03
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

    String space=input.nextLine();
            boolean var=space.contains(" ");


        //      Q04

    /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        //Q05
  /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
  */


    }}