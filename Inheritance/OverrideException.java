package Inheritance;
class A{
    A get()
    {
        return this;
    }
}
class B extends A{
    @Override
    B get()
    {
        return this;
    }
    void message()
    {
        System.out.println("Message");
    }
    public String toString()
    {
        return "Convariant";
        
    }
}
public class OverrideException {
    public static void main(String[] args) {
        System.out.println(new B().get());
    }
}
