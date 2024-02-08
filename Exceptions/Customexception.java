package Exceptions;

class MyException extends Exception{
    MyException(String str)
    {
        super(str);
    }
}
public class Customexception {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            for(int i=0;i<5;i++)
            {
                if(arr[i]>4)
                {
                    MyException e=new MyException("What you are doing bro! work properly");
                    throw e;
                }
            }   
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

