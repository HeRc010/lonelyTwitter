package ca.ualberta.cs.lonelytwitter;

/**
 * Created by adlawren on 1/14/16.
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
