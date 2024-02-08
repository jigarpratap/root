package Inheritance;
class vehicle{
    void run()
    {
        System.out.println("vehicle class is running");
    }
}
class bike extends vehicle{
    void run()
    {
        System.out.println("bike class is running");
    }
}
public class overriding {
    public static void main(String[] args) {
        bike a=new bike();
        a.run();
    }
}
