package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IllegalFormatCodePointException;

/**
 * Created by adlawren on 1/28/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public int getCount() {
        return tweets.size();
    }

    public ArrayList<Tweet> getTweets() {
        ArrayList<Tweet> sortedTweets = tweets;

        Collections.sort(sortedTweets, new Comparator<Tweet>() {
            public int compare(Tweet tweet1, Tweet tweet2) {
                return ((NormalTweet) tweet1).getDate().compareTo(((NormalTweet) tweet2).getDate());
            }
        });

        return sortedTweets;
    }

    public void add(Tweet tweet) throws IllegalArgumentException {
        if (!tweets.contains(tweet)) {
            tweets.add(tweet);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweets.indexOf(tweet));
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
}
