package day15loops;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <6 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("----------------------------");

                int u=10;


            for (int i = -u; i <1 ; i++) {
                for (int j = -u; j <=u ; j++) {
              boolean    yildiz=  Math.abs(i)+Math.abs(j)<u;
                    if(yildiz){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }}
                System.out.println();
            }

    }}

