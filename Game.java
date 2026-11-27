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
        return title;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getPlatform()
    {
        return platform;
    }
    
    public String getAgeRating()
    {
        return ageRating;
    }
    
    public void addRating(int rating)
    {
        ratings.add(rating);
    }
    
    public double getAverageRating()
    {
        if (ratings.size() == 0)
        {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i< ratings.size(); i++)
        {
            sum += ratings.get(i);
        }
        return (double) sum/ratings.size(); 
    }
}