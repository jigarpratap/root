package oops;
class ArimeticType{
    void sum(int a,int b)
    {
        System.out.println("Int is invoke");
    }
    void sum(long a,long b)
    {
        System.out.println("Long is invoke");
    }
}
public class typecastInoverloading {
      public static void main(String[] args) {
        ArimeticType t=new ArimeticType();
        
        t.sum(1, 2);

      }
}
