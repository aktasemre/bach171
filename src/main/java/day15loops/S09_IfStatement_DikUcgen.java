package day15loops;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {
    /*

Soru: Kullanıcıdan üç adet sayı alarak, bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını kontrol eden bir program yazmanız istenmektedir.
Bir üçgenin dik üçgen olduğunu anlamak için Pisagor bağlantısından yararlanabilirsiniz. Pisagor bağlantısı, bir üçgenin dik üçgen olduğunu belirlemek için kullanılan bir formüldür ve a^2 + b^2 = c^2 şeklinde ifade edilir. Burada a, b ve c üçgenin kenar uzunluklarını temsil eder.
İşte programınızın gereksinimleri:
Kullanıcıya üç adet sayı girmesi istenmelidir, bu sayılar üçgenin kenar uzunluklarını temsil eder.
Girilen her sayı negatif veya sıfır olamaz. Eğer kullanıcı negatif veya sıfır bir değer girerse, hata mesajı gösterilmeli ve tekrar geçerli bir değer girmesi istenmelidir.
Girilen kenar uzunluklarıyla bir dik üçgen oluşturulup oluşturulmadığı kontrol edilmelidir. Eğer oluşturulabiliyorsa, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar." şeklinde bir mesaj gösterilmelidir. Dik üçgen değilse, kullanıcıya "Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz." şeklinde bir mesaj gösterilmelidir.
Programınızı bu gereksinimlere uygun olarak yazınız. (edited)
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kalanHakkiniz = 3;
        boolean ucgenOlur;
        do {
            System.out.println("Ucgenin kenarlar uzunluklarini giriniz. Gecerli sayi girme hakkiniz :" + kalanHakkiniz);

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
           boolean pozitifMi= a>0 && b>0 && c>0;
                   ucgenOlur = a + b > c && Math.abs(a - b) < c;
    if (!pozitifMi) {
                System.out.println("Giris yaptiginiz sayilar Pozitif Olmali");
                kalanHakkiniz--;}
            else if (!ucgenOlur) {
                System.out.println("Giris yaptiginiz sayilar ucgen olusturamaz");
                kalanHakkiniz--;}
            else {
               boolean dikUcgen= a*a+b*b==c*c ||  b*b+c*c==a*a || c*c+a*a== b*b;
                     if (dikUcgen){
                   System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uyar.");
                     }else {
                   System.out.println("Girilen kenar uzunlukları bir dik üçgenin kenar uzunluklarına uymaz.");
                     }break;
            }
     if (kalanHakkiniz==0){
                System.out.println("Cok fazla gecersiz giris yaptininz uygulama kapatiliyor");
                break; }
        }
        while (true);

    }
}