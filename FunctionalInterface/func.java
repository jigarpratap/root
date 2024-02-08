public interface fun{
    void display();
}
public interface add{
    int add1(int a,int b);
}
public class func {
    public static void main(String[] args) {
        fun f=()->{
            System.out.println("Yo funcational interface");
        };
        f.display();
        int a=5,b=9;
        add d=(a,b)->a+b;
    }
}
