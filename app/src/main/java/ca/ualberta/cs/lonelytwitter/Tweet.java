package ca.ualberta.cs.lonelytwitter;

import java.util.*;

/**
 * Created by adlawren on 1/14/16.
 */
public class Tweet {
    private String message = null;
    private Date date = null;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;

        // TODO: compute the date dynamically
    }
}
