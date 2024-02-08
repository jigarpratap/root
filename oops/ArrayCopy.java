package oops;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
         char[] ch={'j','a','v','a','p','y','t','h','o','n'};
         char[] ar=new char[8];
         System.arraycopy(ch, 4, ar, 0, 6);
         for(char c:ar)
         {
            System.out.print(c+" ");
         }
         System.out.println();
         ar=ch.clone();
         for(char c:ar)
         {
            System.out.println(c);
         }
         obj.close();
    }
}
