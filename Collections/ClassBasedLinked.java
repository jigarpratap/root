package Collections;
import java.util.LinkedList;


class naruto{
    String name;
    int id;
    naruto(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void SetId(int id){
        this.id=id;
    }

    public void display()
    {
        System.out.println(name+" "+id);
    }
}
public class ClassBasedLinked {
    public static void main(String[] args) {
        LinkedList<naruto> list=new LinkedList<>();
        naruto n=new naruto("kakashi", 10);
        list.add(n);
        list.add(new naruto("Naruto", 1));
        list.add(new naruto("Sasuke", 2));
       for(naruto l:list)
       {
         l.display();
       }
    }
}
