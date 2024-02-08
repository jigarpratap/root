package Exceptions;


import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String str)
    {
        super(str);
    }
}
public class exception20ques {
    public static  int age(int a) throws InvalidAgeException{
        
           if(a<0 || a>150)
           {
             throw new InvalidAgeException("IvalidAge");
           }else
           {        
           return a;
           }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        try{
            int x=scanner.nextInt();
            int n=age(x);
            System.out.println(n);

        }catch(InvalidAgeException e){
             e.printStackTrace();
        }

    }
}
