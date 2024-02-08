import java.util.Scanner;

public class staticsss {
    static int age;
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       staticsss.age=sc.nextInt();
        System.out.print(age);
    }

    public int getAge()
    {
        return age;
    }
}
