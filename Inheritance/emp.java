package Inheritance;

public class emp extends person{
      emp(int id,String name,double salary)
      {
        super(id,name,salary);
      }
      void display()
      {
        System.out.println("ID: "+Id+" "+"Name: "+" "+name+" Salary: "+salary);
      }
}
