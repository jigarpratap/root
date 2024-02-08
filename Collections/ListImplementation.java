package Collections;

import java.util.ArrayList;

public class ListImplementation {
     public static void main(String[] args) {
        ArrayList<Object> a=new ArrayList<>();
        ArrayList<Object> list=new ArrayList<>();
        a.add("kakashi");
        a.add("naruto");
        a.add("sasuke");
        a.add(5);
        //  System.out.println(a);
        //  for(Object n:a)
        //  {
        //     System.out.print(n+" ");
    
        //  }
         System.out.println("Another list section list.add()");
        list.add(a);
        for(Object o:list)
        {
            System.out.println(o);
        }
        System.out.println("Another list section with list.addAll()");
        list.addAll(a);
        for(Object o:list)
        {
            System.out.println(o);
        }
        


     }
}
