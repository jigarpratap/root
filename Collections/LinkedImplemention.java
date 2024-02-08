package Collections;

import java.util.LinkedList;

public class LinkedImplemention {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        list.addFirst(30);
        System.out.println(list);
        list.set(0, 96);
        System.out.println(list);
    }
}
