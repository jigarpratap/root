package Collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class implementionIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            int num=scan.nextInt();
            list.add(num);
        }
        System.out.print("The value of list is:");
        ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
     System.out.println();
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
        scan.close();
    }
}
