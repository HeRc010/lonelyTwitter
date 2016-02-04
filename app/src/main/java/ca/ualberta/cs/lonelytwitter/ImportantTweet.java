package ca.ualberta.cs.lonelytwitter;

/**
 * The class associated with an important Tweet.
 * <p>The isImportant method is override so as to return true.</p><br>
 * @see Tweet
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message) {
        super(message);
    }

    public String getMessage() {
        return "IMPORTANT!" + this.message;
    }

    public Date getDate() {
        return this.date;
    }

    public ArrayList<Mood> getMoods() {
        return this.moods;
    }

    public boolean isImportant() {
        return true;
    }
}
