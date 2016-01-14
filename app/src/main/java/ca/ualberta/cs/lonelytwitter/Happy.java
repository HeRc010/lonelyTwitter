package ca.ualberta.cs.lonelytwitter;

/**
 * Created by adlawren on 1/14/16.
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
