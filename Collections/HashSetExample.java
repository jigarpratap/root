package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;



class HashSetExample{
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        for(int x:h)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Naruto");
        set.add("Sasuke");
        set.add("Kakashi");
        set.add("Itachi");
    
        for(String s:set)
        {
            System.out.print(s+" ");
        }
       
        System.out.println();
        HashSet<Integer> s=new HashSet<>();
        s.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
         
       System.out.println(s);
       ArrayList<String> al=new ArrayList<>(set);
       Collections.sort(al);
       System.out.println(al);

    
    
    }

}