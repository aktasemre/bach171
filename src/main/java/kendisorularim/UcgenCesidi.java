package kendisorularim;

import java.util.Scanner;

public class UcgenCesidi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini Giriniz");

      double a= input.nextInt();
        double b= input.nextInt();
            double c= input.nextInt();


    if (a+b>c &&  Math.abs (a-b)<c){    //ucgen olma sartini yazdim (bir kenar digerlerinin topamindan kucuk olmali
                                        // farkinin mutlak degerinden kucuk olmali
        // ucgen cesidinin yazmasini istedim 2 kenari esitse ikizkenar uc kenari esitse es kenar hepsi farkli ise cesitkenar
            if (a==b && a==c){
                System.out.println("Eskenar ucgen");
            } else if (a==b || a==c || b==c){
                System.out.println("ikizkenar ucgen");
            //bu sarlar saglanmiyorsa  (ikizkenar veya eskenar deil)
            }else {
                System.out.println("cesitkenar ucgen");//cesitkenardir
            }
        //ilk sart saglanmiyorsa
    } else {
        System.out.println("Ucgen olusturamazlar");
    }

}}
