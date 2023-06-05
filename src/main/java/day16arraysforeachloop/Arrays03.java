package day16arraysforeachloop;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


    int ages[] = new int[6];

         ages[0]= 20 ;
        ages[1]= 22 ;
        ages[2]=  29;
        ages[3]=  24;
        ages[4]= 25 ;
        ages[5]= 27 ;

        System.out.println("Arrays.toString(ages) = " + Arrays.toString(ages));
          int  buyuk=ages[0],kucuk=ages[0];

        for (int w:ages) {
            if (buyuk<w){
                buyuk=w;}
            if (kucuk>w){
                kucuk=w;
            }
        }
        System.out.println("buyuk = " + buyuk);
        System.out.println("kucuk = " + kucuk);
        System.out.println("buyuk+kucuk = " + (buyuk + kucuk));
        Arrays.sort(ages);
        System.out.println("sort(ages)) = " + Arrays.toString(ages));
        System.out.println("ages[0]+ages[ages.length-1] = " + (ages[0] + ages[ages.length - 1]));

        String stdName [] = new String[6];
        stdName [0] = "Benna";
        stdName [1] = "Abdullah";
        stdName [2] = "Recep";
        stdName [3] = "yellow";
        stdName [4] = "Ailana";
        stdName [5] = "Ailana";

        for (String w:stdName ) {

               if (w.equals("yellow")){
                continue;
                }
            System.out.println(w);
     }
        DecimalFormat dcm=new DecimalFormat("0.00");
        System.out.printf("Deneme"+ dcm.format(4 / 7));}}
