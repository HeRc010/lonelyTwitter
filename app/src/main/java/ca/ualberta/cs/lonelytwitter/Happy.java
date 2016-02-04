package ca.ualberta.cs.lonelytwitter;

/**
 * The class associated with the Mood Happy.
 * <p>Overrides the format method in order to return a smiley face </p><br>
 * @see Mood
 * @author adlawren
 * @version 2.1
 */
import java.util.*;

public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
        super();
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date newDate) {
        this.date = newDate;
    }

    public String format() {
        return ":)";
    }
}
