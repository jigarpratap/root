package JavaBasic;
import java.util.Scanner;
public class sum2Darray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter The rows and colunms of the first arrya");
        int n=scan.nextInt();
        int m=scan.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter the elements in the first array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
              arr[i][j]=scan.nextInt();
            }
        }
       System.out.println("Enter the rows and colunms of the  2nd array");
       int  n2=scan.nextInt();
       int m2=scan.nextInt();
       int[][] arr2=new int[n2][m2];
       System.out.println("Enter the elements in the second array");
       for(int i=0;i<n2;i++)
       {
           for(int j=0;j<m2;j++)
           {
             arr2[i][j]=scan.nextInt();
           }
       }
         int arr3[][]=new int[n][m];
       for(int i=0;i<n2;i++)
       {
        for(int j=0;j<m2;j++)
        {
             arr3[i][j]=arr[i][j]+arr2[i][j];
        }
       }
       System.out.println("Values after sum");
       for(int i=0;i<n2;i++)
       {
        for(int j=0;j<m2;j++)
        {
            System.out.print(arr3[i][j]+" ");
        }
        System.out.println();
       }
      scan.close();
    }   
}
