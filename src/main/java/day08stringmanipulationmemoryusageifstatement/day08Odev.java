package day08stringmanipulationmemoryusageifstatement;

public class day08Odev {
    public static void main(String[] args) {


        //Homework
        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

            String s="SElmadan 1 Elmas";

                String  rakmOlmayanS=s.replaceAll("\\d","");
        System.out.println("rakmOlmayanS = " + rakmOlmayanS);
        System.out.println("..............................................");
        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz

        String    ilkSonHaric=s.substring(1,s.length()-1).toUpperCase();
        System.out.println("ilkSonHaric = " + ilkSonHaric);
        System.out.println("....................................................");

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
          int Asci= s.charAt(0)+s.charAt(s.length()-1);
        System.out.println("Asci = " + Asci);
        System.out.println("..............................");
        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin
        String sehir="BaybUrT";
       char serhir1= sehir.toUpperCase().charAt(0);
       String sehir2= sehir.toLowerCase().substring(1,sehir.length());
        System.out.println(serhir1+sehir2);
        System.out.println(".........................................");
        //5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        //   a)En az 6 character olsun
        //   b)En az bir tane buyuk harf olsun
        //   c)En az bir tane kucuk harf olsun
        //  d)En az bir tane rakam olsun

        // Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
        //Note 2: Tum sorulari dinamik kodlarla cozulmelidir
        //Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

        String pwd="EMrekrm.";
     boolean        karaktersayisi= pwd.length()>5;
     boolean        buyukKarakter=   pwd.replaceAll("[^A-Z|]}","").length()>0;
      boolean       kucukKarakter= pwd.replaceAll("[^a-z]","").length()>0;
      boolean       rakamIcerme = pwd.replaceAll("\\D","").length()>0;

    if (!karaktersayisi){
        System.out.println("En az 6 character olmali ");
    }
    if (!buyukKarakter) {
        System.out.println("En az bir tane buyuk harf olmali");
    }
    if (!kucukKarakter){

        System.out.println("En az bir tane kucuk harf olmali");
    }
    if (!rakamIcerme){
        System.out.println("En az bir tane rakam olmali");
    }

        System.out.print("Sifreniz gecerli");
    if (!rakamIcerme||!buyukKarakter||!kucukKarakter||!karaktersayisi){
        System.out.println(" degildir");}

    }}