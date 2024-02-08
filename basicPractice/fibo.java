package basicPractice;

import java.util.Scanner;


public class fibo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n=scan.nextInt();
        int n3;
        System.out.print(n1+" "+n2+" ");
        while(n>0)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
            n--;
        }
        scan.close();
    }
}
