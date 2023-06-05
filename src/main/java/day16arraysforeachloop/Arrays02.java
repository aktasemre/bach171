package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin
        String arr [] = new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(  arr[0].length()  + arr[arr.length-1].length()   );

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String brr [] = new String[5];
        brr[0]="Miami";
        brr[1]="Istanbul";
        brr[2]="Ankara";
        brr[3]="Oslo";
        brr[4]="Erzurum";

        //1 yol for loop
        int totalChar=0;

        for (int i = 0; i <brr.length ;             i++) {
            totalChar= totalChar+brr[i].length();

        }
        System.out.println("totalChar = " + totalChar);

        int sum=0;
            for (String w: brr ){
                sum += w.length();

            }
        System.out.println("sum = " + sum);

        int notlar[]=new int[6];
        notlar[0] =20;
        notlar[1] =30;
        notlar[2] =40;
        notlar[3] =50;
        notlar[4] =60;
        notlar[5] =70;
        System.out.println("Arrays.toString(notlar) = " + Arrays.toString(notlar));
       double top=0;
        for (int w:notlar) {

            top += (top+w)/6;

        }
        System.out.println("top = " + top);
    }
}