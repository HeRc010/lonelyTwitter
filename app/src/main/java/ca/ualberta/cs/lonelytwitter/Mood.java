package ca.ualberta.cs.lonelytwitter;

/**
 * The class associated with a Mood.
 * <p>Contains the date associated the Mood and a method to return a String</p><br> which characterizes the mood.
 * @see Tweet
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public abstract class Mood {
    protected Date date;

    public Mood(Date initialDate) {
        this.date = initialDate;
    }

    public Mood() {
        this.date = new Date(System.currentTimeMillis());
    }

    abstract String format();
}
