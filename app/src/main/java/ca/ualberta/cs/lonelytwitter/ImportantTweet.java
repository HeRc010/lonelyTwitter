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

    // TODO: // FIXME: 1/14/16 
    public Date getDate() {
        return new Date();
    }

    public boolean isImportant() {
        return true;
    }
}
