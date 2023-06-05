package kendisorularim;

import java.util.Arrays;

public class deneme {
    /*Soru: Bir tamsayı dizisi verildiğinde, bu dizideki en büyük üç
    sayının toplamını bulan bir Java fonksiyonu yazmanızı istiyoruz.
    Eğer dizi geçerli değilse (null veya boş ise veya en az üç eleman içermiyorsa), fonksiyon -1 değerini döndürmelidir.*/
    public static void main(String[] args) {
       int sayilar[]=new int[5];

        sayilar[0]=15;
        sayilar[1]=10;
        sayilar[2]=125;
        sayilar[3]=13;
        sayilar[4]=61;

        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
       int top=sayilar[sayilar.length-3]+sayilar[sayilar.length-2]+sayilar[sayilar.length-1];
        System.out.println("top = " + top);

    }
}
