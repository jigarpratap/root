package Collections;
import java.util.*;
public class HashsetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.addAll(Arrays.asList(new Integer[]{1,2,3,4,5}));
        HashSet<Integer> h2=new HashSet<>();
        h2.addAll(Arrays.asList(new Integer[] {6,7,8,9,10,1,2}));
        h.removeAll(h2);
       // System.out.println("The union of set");
        System.out.println(h);
        // System.out.println("The Intersection of sets");
        // h.removeAll(h2);
        // System.out.println(h);
        // System.out.println("The difference of sets");
        // h.removeAll(h2);
        // System.out.println(h);
    }
}
