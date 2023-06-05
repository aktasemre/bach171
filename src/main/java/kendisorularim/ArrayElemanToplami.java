package kendisorularim;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanToplami {


    public static void main(String[] args) {
        //Soru: Bir çok boyutlu dizideki(Multidimensional Array ) elemanları toplayan ve bu toplamı return eden bir Metod yazmak istiyoruz.
// Program, kullanıcıdan bir çok boyutlu dizinin boyutunu ve elemanlarını girmesini isteyecek.
// Ardından, dizideki tüm elemanları toplayacak ve bu toplamı ekrana yazdıracaktır. Nasıl bir çözüm önerirsiniz?

        kacBoyutlu();

    }

    public static void kacBoyutlu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Array satir boyutu kac olsun");
        int satir = input.nextInt();
        System.out.println("Array sutun boyutu kac olsun");
        int sutun = input.nextInt();
        int arr[][] = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Lutfen " + (i + 1) + ". satir in " + (j+1)+ ". elemanlarini giriniz");
                arr[i][j] = input.nextInt();
            }
        }
        int top=0;
        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j < sutun; j++) {
                top+=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(top);
    }}