package day15loops;

import java.util.Scanner;

public class S08_StringManipulations_IfElse {
    public static void main(String[] args) {

        /*
        Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
        bir Java programı yazınız.
    */

        Scanner input=new Scanner(System.in);
           String str= input.nextLine();

           if (str.length()<3){
               System.out.println("3 karakterden kisa");}
           else 
               {
                   String son = str.substring(str.length() - 3, str.length());
                   System.out.println(son+str+son);   }

    }
}
