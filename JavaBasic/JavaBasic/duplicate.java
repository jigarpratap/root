package JavaBasic;
import java.util.Scanner;

class duplicate{
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
   scan.close();

    }
}