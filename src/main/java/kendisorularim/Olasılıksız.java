package kendisorularim;

import java.util.Arrays;

public class Olasılıksız {
    //"Olasılıksız" stringindeki ikinci 'ı' karakterinin index ini bulunuz
    public static void main(String[] args) {

        String str = "Olasılıksız";
        String strarr[] = str.split("");
        System.out.println("Array = " + Arrays.toString(strarr));
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {

            if (strarr[i].equals("ı")) {
                sayac++;
            }
            if (sayac == 2) {
                System.out.println("'ı' 2. indeksi :" + i);
                break;
            }
        }
    }
}
