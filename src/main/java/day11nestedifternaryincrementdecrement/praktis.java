package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class praktis {
    public static void main(String[] args) {

        String a = null;//hata vermemesi icin tanimlanmasi gerekti
        int b = 0;      //bos bir vereybl olusturduk bunlari metot da tekrar degistirdik
        ehliyetSorgu(a,b); // cagirdigimiz medot
        
        
    }
                public static void ehliyetSorgu(String a , int b){
                    Scanner input= new Scanner(System.in);//kullanicidan data almak icin olusturdugumuz obje
                    System.out.println("Turkiye Cumhuriyeti vatandasi misiniz evet(Y) hayir(N)");

                    Character vadandas= input.next().toLowerCase().charAt(0);//veri tipini bilerek Nan-primitive sectim
                                                                            //cunku (3)numara
                    System.out.println("Yasinizi giriniz");
                    int  yas=  input.nextInt();


                    boolean saglanir= vadandas.equals('y') && yas>18; //3 eguals medodunu kullanabilmek icin

                    if (saglanir){
                        System.out.println("Ehliyet alabilirsiniz");
                    }else {
                        System.out.println("Ehliyet almak için gereksinimleri sağlamıyorsunuz");
                    }
            
                }    
        
    }