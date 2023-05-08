package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("lutfen 5 basamakli  bir sayi giriniz");

       int a=input.nextInt();

        System.out.println("ilkIkisayiTop = " + ilkIkisayi(a));
        System.out.println("sonIkisayiTop = " + sonIkisayi(a));

    }
    //ilk iki sayisini toplayan medoduyazdik
public static int ilkIkisayi(int number){
        number=number/1000;
        int binler=number%10;
        int onbinler=number/10;
        return binler+onbinler;
}
//Son iki sayisini toplayan metodu yazdik
public static int sonIkisayi(int number){
        int birler=number%10;
        number=number/10;
        int onlar=number%10;
        return birler+onlar;
    }
}
