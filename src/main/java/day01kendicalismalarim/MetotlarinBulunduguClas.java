package day01kendicalismalarim;

public class MetotlarinBulunduguClas {

    public int x=4,y=5;

    public int topla(int a,int b){

     return a+b;
    }
    int carp=1;
    public int faktoriyel(int a){
        for (int i = 1; i <a+1 ; i++) {

         carp= carp*i;

        }
        return carp;
    }
    public int C(int n,int r){
      return faktoriyel(n)/faktoriyel((n-r));

    }

}
