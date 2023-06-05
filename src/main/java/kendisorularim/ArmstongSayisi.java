package kendisorularim;

public class ArmstongSayisi {/*
"1'den 1000'e kadar olan sayılardan, her bir sayının basamaklarının küpleri toplamı kendisine eşit olan Armstrong
sayılarını bulan bir program yazın."
Bir Armstrong sayısı, her bir basamağının küplerinin toplamının kendisine eşit olduğu bir sayıdır.
Örneğin, 153 bir Armstrong sayısıdır, çünkü 1^3 + 5^3 + 3^3 = 153'e eşittir.
Sizden istenen program, 1'den 1000'e kadar olan tüm Armstrong sayılarını bulmalıdır. İyi şanslar!

    gece uyumayanlar için */

    public static void main(String[] args) {
        int num=1000;
        for (int i = 10; i <num ; i++) {

            if(i<100){
               int birler=i%10;
                int onlar= i/10;

             int Arms= (int) (Math.pow(birler,3)+Math.pow(onlar,3));
                if(i==Arms){
                    System.out.print(i+"-");
                }
            }else {

                int birler=i%10;
                int onlar=(i/10)%10;
                int yuzler=i/100;
                int Arms= (int) (Math.pow(birler,3)+Math.pow(onlar,3)+Math.pow(yuzler,3));
                if(i==Arms){
                    System.out.print(i+"-");
                }
            }
        }



    }
}
