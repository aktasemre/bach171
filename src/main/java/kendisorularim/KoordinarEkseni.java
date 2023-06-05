package kendisorularim;

public class KoordinarEkseni {
    public static void main(String[] args) {
        int sayi=5;
        for (int i = -sayi; i <=sayi ; i++) {

            for (int j = -sayi; j <=sayi ; j++) {
                System.out.print("(" +j+","+i+")"+"\t");
            }
            System.out.println();
        }


    }
}
