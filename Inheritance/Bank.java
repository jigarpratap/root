package Inheritance;
abstract class RBI{
    abstract int getRateOfInterest();
}
class SBI extends RBI{
    int getRateOfInterest()
    {
        return 7;
    }
}
class PNB extends RBI{
    int getRateOfInterest()
    {
        return 8;
    }
}

public class Bank {
    public static void main(String[] args) {
        RBI r;
        r=new SBI();
        System.out.println(r.getRateOfInterest());
        r=new PNB();
        System.out.println(r.getRateOfInterest());
    }
    
}
