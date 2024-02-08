package basicPractice;

import java.util.Scanner;

public class pali {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();
        int n=s;
        int rev=0;
        while(s>0)
        {
            int rem=s%10;
            rev=rev*10+rem;
            s=s/10;
        }
        if(rev==n)
        {
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
        scanner.nextLine();

        String pal=scanner.nextLine();
        String r="";
        for(int i=0;i<pal.length();i++)
        {
             r=pal.charAt(i)+r;
        }
        if(r.equals(pal)){
            System.out.println("true");
        }else
        {
            System.out.println("False");
        }

        scanner.close();
    }
}
