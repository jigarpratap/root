package Inheritance;

public class programmer extends Employee1{
    float bonus=1000;
    // programmer()
    // { 
    //     System.out.println("im in child constructor");
    // }
    programmer(int a)
    {  
        super(a);
       System.out.print("The value of parameterized constructor "+a);
    }
    void display()
    {
        super.display();
        System.out.println("Salary is: "+salary+" and bonus is: "+bonus);
    }
}
