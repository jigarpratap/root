package oops;

public class staticImplements {
     private int i1;
     private static int i2;
     public int getI1()
     {
          return i1;
     }
     public int i2()
     {
          return i2;
     }
     public void setI1(int i1)
     {
          this.i1=i1;
     }
     public void setI2(int i2)
     {
          staticImplements.i2=i2;
     }
     public void display()
     {
          System.out.println("I1 value: "+i1+"\n"+"I2 value is: "+i2);
     }
     
}
