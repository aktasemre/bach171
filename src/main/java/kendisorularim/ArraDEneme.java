package kendisorularim;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraDEneme {/*
  Task-> Verilen  bir arrayin tum elemanlarini
   bir soldaki konuma print eden kodu yaziniz
  input:  [1,2, 3]
   output [2, 3, 1]
   */

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki  tam sayi Giriniz");

        int ilkSayi= input.nextInt();
        int ikinciSayi= input.nextInt();
        int arrlengt=Math.abs(ikinciSayi-ilkSayi);
        int arr[]=new int[arrlengt+1];
        int arrnew[]=new int[arr.length];


        if (ikinciSayi>ilkSayi){

            for (int i = 0; i < arrlengt+1; i++) {
                arr[i]=ilkSayi+i;
            }



            System.out.println(Arrays.toString(arr));

            for (int i=0;i<arr.length;i++){
                if (i<arr.length-1){
                    arrnew[i]=arr[i+1];
                }else {
                    arrnew[arr.length-1]=arr[0];
                }
            }


        }else {
            for (int i = 0; i < arrlengt+1; i++) {
                arr[i]=ilkSayi-i;
            }



            System.out.println(Arrays.toString(arr));

            for (int i=0;i<arr.length;i++){
                if (i<arr.length-1){
                    arrnew[i]=arr[i+1];
                }else {
                    arrnew[arr.length-1]=arr[0];
                }
            }

        }



        System.out.println(Arrays.toString(arrnew));
    }

}
