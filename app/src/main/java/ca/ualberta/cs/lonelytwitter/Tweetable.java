package ca.ualberta.cs.lonelytwitter;

/**
 * The interface which defines a Tweetable class.
 * <p>It contains a list of tweets.</p><br>
 * @see ca.ualberta.cs.lonelytwitter.NormalTweet
 * @see ca.ualberta.cs.lonelytwitter.ImportantTweet
 * @see Mood
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public interface Tweetable {
    public String getMessage();
    public Date getDate();
    public ArrayList<Mood> getMoods();
}
