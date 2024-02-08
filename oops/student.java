package oops;

public class student {
    int rollno;
    String name;
    float fee;
    student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println("roll no: "+rollno+"\nName: "+name+"\nFee: "+fee);
    }
}
