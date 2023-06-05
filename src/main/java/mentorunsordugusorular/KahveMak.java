package mentorunsordugusorular;

import java.util.Scanner;

public class KahveMak {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Hangi Kahveyi İstersiniz?");
        System.out.println("1.Türk kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Espresso");
        String  hangiKahve =input.nextLine();
         boolean   dogruKahve =hangiKahve.equalsIgnoreCase("Türk kahvesi")
                 || hangiKahve.equalsIgnoreCase("Filtre Kahve")
                 || hangiKahve.equalsIgnoreCase("Espresso");
       if (dogruKahve){
           System.out.println(hangiKahve+" hazirlaniyor");
       }else {
           System.out.println("Hatalı tuşlama yaptınız.");}


        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
                        String sut=input.next();
                        if (sut.equalsIgnoreCase("Evet")){
                            System.out.println("Süt ekleniyor...");
                        } else if (sut.equalsIgnoreCase("Hayır")) {
                            System.out.println("Süt eklenmiyor");
                        }else {
                            System.out.println("Hatali Giris yaptiniz");}


        System.out.println("Seker ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
        String seker=input.next();
        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker istersiniz");
           int kacSeker= input.nextInt();
            System.out.println(kacSeker+" seker ekleniyor...");
        } else if (seker.equalsIgnoreCase("Hayır")) {
            System.out.println("Şeker eklenmiyor");
        }
        String bosKod = input.next();// tekrar ogren!!!


        System.out.print("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy ) :");
                String boyut=input.nextLine();
                boolean Boyut=boyut.equalsIgnoreCase("Büyük boy")
                                || boyut.equalsIgnoreCase("orta boy")
                                || boyut.equalsIgnoreCase("küçük boy");
                if (Boyut){
                    System.out.println("Kahveniz" + boyut + "hazırlanıyor.");
                }

        System.out.println(hangiKahve +" "+boyut+" hazirdir.");
        System.out.println("Afiyet olsun");



}}
