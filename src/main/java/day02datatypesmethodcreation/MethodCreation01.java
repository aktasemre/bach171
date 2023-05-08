package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {
        long B=carp(4,7);
        int A=topla(3,5);
            int C=işlemYap(3,4,6);
        System.out.println(C);
        System.out.println(A);
        System.out.println(B);

    }
public static int topla(int a,int b){
   return  a+b;

}

protected static int carp(int a,int b){

        return a*b;
}

       public static int işlemYap(int a,int b,int c){
        return (a * b) + c;
}


}
