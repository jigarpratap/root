package Collections;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie>{
  private String name;
  private int year;
  private double rating;
    @Override
    public int compareTo(Movie that) {
          return that.year-this.year;
    }
    Movie(String name,int year,double rating)
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
class Rating implements Comparator<Movie>{

    @Override
    public int compare(Movie a, Movie b) {
        if(a.getRating()<b.getRating())
        {
           return -1;
        }
        if(a.getRating()>b.getRating())
        {
           return 1;
        }else
        {
           return 0;
        }
    }
    
}
public class comparaableExample {
    public static void main(String[] args) {
        ArrayList<Movie> a=new ArrayList<>();
        a.add(new Movie("Naruto", 2016, 10));
        a.add(new Movie("One piece",2020, 8));
        a.add(new Movie("Silent voice", 2012, 9));
        Collections.sort(a,new Rating());
        for(Movie m:a)
        {
            System.out.println(m.getYear()+" "+m.getName()+" "+m.getRating());

        }
    }
}
