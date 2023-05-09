package day01kendicalismalarim;

public class MetotlainBulunduguClas {

    public int x=4,y=5;

    public int topla(int a,int b){

     return a+b;
    }

    public int faktoriyel(int a){
        int carp=1;
        for (int i = 1; i <a+1 ; i++) {

         carp= carp*i;

        }
        return carp;
    }
    public int C(int n,int r){
      return faktoriyel(n)/(faktoriyel((n-r))*faktoriyel(r));

    }

}
