package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//external to element type, its a seperate class
//passed to sort
//comapre ovverride 
//multiple comparisons 
public class Movie2 {
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(Movie2 m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public Movie2(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName() { return name; }
    public int getYear() { return year; }
}
class RatingCompare implements Comparator<Movie2> {
    @Override
    public int compare(Movie2 m1, Movie2 m2) {
        // TODO Auto-generated method stub
        if(m1.getRating() < m2.getRating()) return -1;
        if(m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList<Movie2> list = new ArrayList<Movie2>();
        list.add(new Movie2("Force Awakens", 8.3, 2015));
        list.add(new Movie2("Star Wars", 8.7, 1977));
        list.add(
            new Movie2("Empire Strikes Back", 8.8, 1980));
        list.add(
            new Movie2("Return of the Jedi", 8.4, 1983));
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        // NameCompare nameCompare = new NameCompare();
        // Collections.sort(list, nameCompare);
 
    }
}

