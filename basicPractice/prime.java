package basicPractice;

import java.util.Scanner;

public class prime {
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            return false;
        }
    }
    return true;


    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
         if(isPrime(n)){
            System.out.println("Is prime");
         }else
         {
            System.out.println("Not prime");
         }

    }
}
