package day14loops;

import java.util.Scanner;

public class Odev02 {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
              String str= input.nextLine();

              LongestWord(str);

    }
    public static void LongestWord( String str){

        int KelimeSayisi=str.replaceAll("\\S", "").length()+1;//Kac Space varsa 1 fazlasi kadar kelime vardir
        String uzunKelime="";

        for (int i = 0; i <KelimeSayisi ; i++) {
            String  a= str.split(" ")[i];//ilk kelimeden son kelimeye kadar butun kelimeleri elime aldim
            int  keime=a .length();// bu kelimenin uzunligunu buldum
            if (uzunKelime.length()<keime){ //eger onceki kelimeden buyukse degistir
                uzunKelime=a;
            }
        }
        System.out.println(uzunKelime);
    }
}
