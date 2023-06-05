package kendisorularim;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayseOtomatikEkleme {


    public String[] drToplucaEkleme() {

        Scanner input = new Scanner(System.in);

        System.out.print("Subenizde calisan dr sayisini giriniz : ");
        int a = input.nextInt();
        String dr[] = new String[a];

        System.out.println("Subedeki drlarin isimini giriniz");
        int i = 0;
        while (i < a) {
            String isim = input.next();

            dr[i] = isim;


            i++;
        }
        System.out.println(Arrays.toString(dr));
        return dr;
    } }
