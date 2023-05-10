package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {

        int x=12,y=10;
        System.out.println(x+ "--"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x+ "--"+y);

    }
}
