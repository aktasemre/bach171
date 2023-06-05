package kendisorularim;

import java.util.Scanner;

public class ElmasYildiz {
    /*Elmas şekli için konsol çıktısı şöyle olacaktır:

    Örneğin, kullanıcı tarafından girilen sayı 5 ise:

                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *
    Girilen sayıya göre elmasın boyutu değişecektir. uygun kodu yazalim
} */public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Elmasin buyuklugu kac sair olsun");
        int a=input.nextInt();

        for (int i = -a; i < a+1; i++) {

            for (int j = -a; j < a+1; j++) {

              boolean yildizKoy=  Math.abs(i)+Math.abs(j)==a;//Matematiksel bir fonksiyon yazdim |x|+|y|=r
                                                                // "==" yerine <= yapilirsa elmasin icinin
                                                                // dolu olacagini dusunuyorum
                    if (yildizKoy){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }

            }
            System.out.println();

        }}}