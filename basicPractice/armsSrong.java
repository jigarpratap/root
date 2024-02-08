package basicPractice;

import java.util.Scanner;

public class armsSrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int temp=n;
        int sum=0;
        while(temp>0)
        {
            int rev=temp%10;
            sum=sum+rev*rev*rev;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println("e");
        }else{
            System.out.println("not e");
        }
    }
}
