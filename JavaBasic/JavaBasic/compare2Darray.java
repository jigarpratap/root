package JavaBasic;
import java.util.Scanner;
public class compare2Darray {
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
      int flag=0;
       if(n==n2 &&m==m2)
       {
          for(int i=0;i<n2;i++)
          {
            for(int j=0;j<m2;j++)
            {
                if(arr[i][j]!=arr2[i][j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
          }
       }else
       {
          System.out.println("Matrix is not same");
       }
      
       if(flag==1)
       {
         System.out.println("Matrix is not same");
       }else
       {
        System.out.println("Matrix is same");
       }
   scan.close();
    }
}
