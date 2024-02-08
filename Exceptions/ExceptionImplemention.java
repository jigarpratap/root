package Exceptions;

public class ExceptionImplemention {
    public static void main(String[] args){
        try{
        int a=4;
        int b=0;
        System.out.println(a/b);
        }catch(ArithmeticException e)
        {   e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
