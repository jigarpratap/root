package Exceptions;

public class exception2 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        int i;
        try{
            i=arr[5];
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
