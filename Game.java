import java.util.ArrayList;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private String genre;
    private String platform;
    private String ageRating;
    private ArrayList <Integer> ratings;
    /**
     * Constructor for objects of class Game
     */
    public Game(String title, String genre, String platform, String ageRating)
    {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        ratings = new ArrayList<Integer>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getTitle()
    {
        // put your code here
        return title;
    }
}