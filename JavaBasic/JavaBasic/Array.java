package JavaBasic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(arr[-1]);
     scan.close();
    }

}
