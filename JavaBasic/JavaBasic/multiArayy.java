package JavaBasic;

import java.util.Scanner;



public class multiArayy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the two dimensional array value");
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              arr[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
