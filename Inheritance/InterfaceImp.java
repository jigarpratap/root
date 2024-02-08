package Inheritance;
interface b{
  public int getRate();
}
class sbi implements b{
   public int getRate()
    {
        return 9;
    }
}
class pnb implements b{
    public int getRate()
    {
        return 8;
    }
}
public class InterfaceImp {
    public static void main(String[] args) {
        b e=new sbi();
        System.out.println(e.getRate());
    }
}
