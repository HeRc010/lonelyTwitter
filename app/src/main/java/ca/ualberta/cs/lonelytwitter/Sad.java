package ca.ualberta.cs.lonelytwitter;

/**
 * The class associated with the Mood Sad.
 * <p>Overrides the format method in order to return a sad face </p><br>
 * @see Mood
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public class Sad extends Mood {
    public Sad(Date date) {
        super(date);
    }

    public Sad() {
        super();
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    public String format() {
        return ":(";
    }
}
