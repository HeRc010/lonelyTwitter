package ca.ualberta.cs.lonelytwitter;

/**
 * Created by adlawren on 1/14/16.
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
