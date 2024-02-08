package Exceptions;
import java.util.*;
class MYExpetion extends Exception{
    MYExpetion(String str)
    {
        super(str);
    }
}
public class exceptionJava {
    public static int div(int a ,int b) throws MYExpetion
    {
        int res=a/b;
        return res;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int x=obj.nextInt();
        int y=obj.nextInt();
        try{
          if(y==0)
          {
            throw new MYExpetion("DivsionByZero");
          }
         int r=div(x, y);
         System.out.println("The value of r is"+r);
         
    
        }catch(MYExpetion e)
        {
             e.printStackTrace();
        }finally{
         obj.close();
        }
        
    }
}
