package Inheritance;
class Animal{
   public void eat()
   {
    System.out.println("eating");
   }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("Barking");
    }
}
class babydog extends dog{
    void weep()
    {
        System.out.println("Weeping");
    }
}
public class mutilevel {
    public static void main(String[] args) {
        babydog b=new babydog();
        b.eat();
        b.bark();
        b.weep();
    }
}
