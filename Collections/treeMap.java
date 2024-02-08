package Collections;

//import java.security.KeyStore.Entry;
//import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        HashMap<Integer,String> t=new HashMap<>();
        t.put(1,"Naruto");
        t.put(2,"sasuke");
        t.put(3,"Kakashi");
        t.put(4,"itachi");
        for(Entry<Integer, String> e:t.entrySet())
        {
            System.out.print(e+"  ");
        }
        t.put(1,"naruto");
        System.out.println(t.remove(10));
        System.out.println(t);
        Iterator it=t.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry m=(Map.Entry)it.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
