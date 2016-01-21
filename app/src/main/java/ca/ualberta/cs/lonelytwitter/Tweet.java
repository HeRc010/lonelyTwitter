package ca.ualberta.cs.lonelytwitter;

import java.util.*;

/**
 * Created by adlawren on 1/14/16.
 */
public abstract class Tweet {
    protected String message = null;
    protected Date date = null;
    protected ArrayList<Mood> moods;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }

    public void setMessage(String newMessage) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }

        this.message = newMessage;
    }

    public void setDate(Date newDate) {
        date = newDate;
    }

    public void addMoods(Mood[] newMoods) {
        this.moods.addAll(Arrays.asList(newMoods));
    }

    public void addMood(Mood newMood) {
        this.moods.add(newMood);
    }

    abstract boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
