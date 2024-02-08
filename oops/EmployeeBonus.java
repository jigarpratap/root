package oops;


class emp{
    int empid;
    String name;
    String type;
    double basic;
    emp(int empid,String name,String type,double basic)
    {
        this.empid=empid;
        this.name=name;
        this.type=type;
        this.basic=basic;
    }
    public int getEmpid()
    {
       return empid;
    }
    public String getName()
    {
       return name;
    }
    public String getType()
    {
       return type;
    }
    public double getBasic()
    {
       return basic;
    }
   
    public double calBonus(float basic,int days)
   {
       double net=basic*days;
       return net;
   } 
   public double calBonus(double basic,int days,double percent)
   {
    double net=basic*days+basic*percent;
    return net;
   }

}
public class EmployeeBonus {
    public static void main(String[] args) {
        
    }
}
