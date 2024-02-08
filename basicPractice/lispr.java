package basicPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lispr {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int r=scanner.nextInt();
            if(!list.contains(r))
            {
            list.add(r);
            }
        }
        System.out.println(list);
        int num=scanner.nextInt();
        if(list.contains(num))
        {   
            int i=list.indexOf(num);
            list.remove(i);
        }else
        {
            list.add(num);
        }
        for(int x:list)
        {
            System.out.print(x+" ");
        }
    }
}
