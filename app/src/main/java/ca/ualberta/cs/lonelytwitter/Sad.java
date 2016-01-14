package ca.ualberta.cs.lonelytwitter;

/**
 * Created by adlawren on 1/14/16.
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
