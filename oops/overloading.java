package oops;
class Arthmetic{

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class overloading {
    public static void main(String[] args) {
        Arthmetic a=new Arthmetic();

        System.out.println(a.add(2, 8));
        System.out.println(a.add(1, 2, 3));
    }
}
