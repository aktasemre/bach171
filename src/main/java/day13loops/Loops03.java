package day13loops;

public class Loops03 {
    public static void main(String[] args) {

        String str= "AnkRa";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)>='a' && str.charAt(i)<='z' ){
                continue;
            }else System.out.print(str.charAt(i));


        }


    }
}
