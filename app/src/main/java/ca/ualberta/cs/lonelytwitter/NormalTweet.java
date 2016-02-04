package ca.ualberta.cs.lonelytwitter;

/**
 * The class associated with a list of tweets.
 * <p>It contains a list of tweets.</p><br>
 * @see Tweet
 * @see Mood
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String message) {
        super(message);
    }

    public String getMessage() {
        return this.message;
    }

    public Date getDate() {
        return this.date;
    }

    public ArrayList<Mood> getMoods() {
        return this.moods;
    }

    public boolean isImportant() {
        return false;
    }
}
