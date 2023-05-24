package day15loops;

public class WhileLoop01 {

    public static void main(String[] args) {
            int i=3,top=0;

        while (i<7){
            top=top+i;
            i++;
        }
        System.out.println(top);

        int a=23;
        while (a>11){
            if (a%2==0){
                System.out.print(a+" ");
            }
       a--; }


int b=6;
        while (b<20){
            if (b%2!=0){
                System.out.print(" "+b);
            }
            b++;
        }

    }
}
