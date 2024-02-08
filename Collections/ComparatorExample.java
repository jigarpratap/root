package Collections;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Moviee implements Comparable<Moviee>{
  private String name;
  private int year;
  private double rating;
    @Override
    public int compareTo(Moviee that) {
          return that.year-this.year;
    }
    Moviee(String name,int year,double rating)
    {
        this.name=name;
        this.rating=rating;
        this.year=year;
    }
    public String getName()
    { 
         return name;
    }
    public int getYear()
    {
        return year;
    }
    public double getRating()
    {
        return rating;
    }

}
class Rating implements Comparator<Moviee>{

    @Override
    public int compare(Moviee a, Moviee b) {
         return a.getName().compareTo(b.getName());
    }
    
}
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Moviee> a=new ArrayList<>();
        a.add(new Moviee("Naruto", 2016, 10));
        a.add(new Moviee("One piece",2020, 8));
        a.add(new Moviee("Silent voice", 2012, 9));
        Collections.sort(a,new Rating());
        for(Moviee m:a)
        {
            System.out.println(m.getYear()+" "+m.getName()+" "+m.getRating());

        }
    }
}
