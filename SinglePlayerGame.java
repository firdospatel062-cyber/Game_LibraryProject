
/**
 * Write a description of class SinglePlayerGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayerGame extends Game {
  public SinglePlayerGame(String title, String genre, String platform, String ageRating)
  {
      super (title, genre, platform, ageRating);
  }
  
  public void printDetails(){
      super.printDetails();
      System.out.println(" Type: Single-player ");
  }
}