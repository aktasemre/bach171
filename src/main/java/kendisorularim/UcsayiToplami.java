package kendisorularim;

public class UcsayiToplami {

    public static void main(String[] args) {

        /*Soru a sayısından b sayısına kadar olan  sayıların
  ve her bir sayının kendinden önceki iki sayının toplamlarını  bulan bir program yazmanız isteniyor.
örnek 1+(0+(-1))+   2+(1+0)+   3+(2+1)+ 4+(3+2) .......
*/
            int a=5,b=8, top=0;
        for (int i = a; i <=b ; i++) {
            top+=i+(i-1)+(i-2);
        }
        System.out.println(top);
    }

}
