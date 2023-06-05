package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Arrayden kac tane eleman ekleyeceksiniz");

            int  ogrenciSayisi= input.nextInt();

            String stdNames[] = new String[ogrenciSayisi];
        System.out.println("islemi durdurmak icin 'Q' ya basiniz");

        for (int i = 0; i <stdNames.length-1 ; i++) {
            System.out.println((i+1)+". ogrencinin ismini giriniz");
            String name =input.nextLine();
            input.next();
            if (name.equalsIgnoreCase("Q")){ break;}
            else {
                stdNames[i]=name;
            }

    }
        System.out.println(Arrays.toString(stdNames));
}}
