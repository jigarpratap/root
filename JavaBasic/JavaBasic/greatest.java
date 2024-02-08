package JavaBasic;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
        scan.close();
    }
}
