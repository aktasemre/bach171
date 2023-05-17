package mentorunsordugusorular;

import java.util.Scanner;

public class Sorular01 {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
         /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma
  ve cekme, çıkış işlemlerinin yapıldıgı bir
   ATM app. method create ediniz


   */
   //     Q02
                /*
                 * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
                 * return eden metod yaziniz
                 *
                 * ornek:  input            output
                 *         elma  2           eaea
                 *         army  3           ayayay
                 */
   //             Q03

        System.out.println("Bir String giriniz");
                String s1= input.nextLine().replaceAll("[^a-zA-Z]","");

              char ilk= s1.charAt(0);
                     char   son=s1.charAt(s1.length()-1);
        System.out.println(""+ilk+son+ilk+son);
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        System.out.println("Yazdiginiz Streng de bosluk var");
            String   s2 =input.nextLine();
                     boolean varmi=   s2.contains(" ");
        System.out.println( varmi);
                     //Q04
     //TASK :
    //   Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
      // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        System.out.println("Adinizi Soyadinizi giriniz");
                    String s3= input.nextLine();
         String   Adi=    s3.split( " ")[0];
        String   Soyadi=    s3.split( " ")[1];

        System.out.println("Adi = " + Adi);
        System.out.println("Soyadi = " + Soyadi);
        //        Q05
    //TASK :
        //Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         //Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        System.out.println("Lutfen iki adinizi ve Soyadinizi giriniz");

                    String s4= input.nextLine();
                    s4=s4.trim().toUpperCase();
        System.out.println("s4.split(\"\") = " + s4.split(""));
        char ilkHarf=s4.charAt(0);
                    char   ikinciHarf= s4.split(" ")[1].charAt(0);
                    char ucuncuHarf=s4.split(" ")[2].charAt(0);

        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf+".");
}}