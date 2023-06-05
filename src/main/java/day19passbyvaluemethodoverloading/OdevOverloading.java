package day19passbyvaluemethodoverloading;



import java.util.Scanner;

public class OdevOverloading {
    public static void main(String[] args) {

/*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/

        System.out.print("fiyat :"+ BiletFiyati("C", 34));

    }


    public static double BiletFiyati(String Sehir, int yas) {
        System.out.println("Nereye gideceksiniz");
        Scanner input = new Scanner(System.in);
        Sehir = input.next().toUpperCase().substring(0, 1);
        int Yol = 0;
        switch (Sehir) {
            case "B":
                Yol = 500;
                break;
            case "C":
                Yol = 700;
                break;
            case "D":
                Yol = 900;
                break;
        }
        System.out.println("Yasinizi giriniz");
        yas = input.nextInt();
        double ucret = Yol * 0.10;
        if (yas < 12) {
            ucret = ucret * 0.50;
        } else if (yas < 24) {
            ucret = ucret * 0.90;
        } else if (yas > 65) {
            ucret = ucret * 0.70;
        }
        System.out.println("tek yon icin :1" +
                "gidis donus icin :2' ye basiniz");
        int yon = input.nextInt();
        if (yon == 2) {
            ucret = ucret * 2 * 0.80;
        }
        return ucret;

    }
}
