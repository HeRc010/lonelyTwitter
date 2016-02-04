package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The class the tests associated with the TweetList class.
 * <p>Unit tests are used to test each method of the TweetList class.</p><br>
 * @see TweetList
 * @author adlawren
 * @version 2.1
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    // public void setup() {} // not recommended
    // Note: tests are not run in a fixed order

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Test");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));

        // Ensure that the correct exception is thrown when trying to add a duplicate tweet
        try {
            tweets.add(tweet);

            fail();
        } catch (IllegalArgumentException e) {}
    }

    public void testTweetCount() {
        TweetList tweets = new TweetList();
        tweets.add(new NormalTweet("Test 1"));
        tweets.add(new NormalTweet("Test 2"));
        tweets.add(new NormalTweet("Test 3"));

        assertEquals(tweets.getCount(), 3);
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Test");

        assertFalse(tweets.hasTweet(tweet));

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Test");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertTrue(returnedTweet.equals(tweet));
    }

    public void testGetTweets() throws InterruptedException {
        TweetList tweets = new TweetList();
        tweets.add(new NormalTweet("Test 1"));
        Thread.sleep(1000);

        tweets.add(new NormalTweet("Test 2"));
        Thread.sleep(1000);

        tweets.add(new NormalTweet("Test 3"));
        Thread.sleep(1000);


        ArrayList<Tweet> tweetList = tweets.getTweets();
        assertEquals(tweetList.size(), 3);

        // TODO: remove; a test used to break the test
        // Collections.reverse(tweetList);

        // Ensure the tweets are sorted in ascending chronological order
        if (tweetList.size() != 1) {
            for (int i = 1; i < tweetList.size(); ++i) {

                // FIXME: cast needed here
                NormalTweet previousTweet = (NormalTweet) tweetList.get(i - 1);
                NormalTweet nextTweet = (NormalTweet) tweetList.get(i);

                assertTrue(previousTweet.getDate().getTime() <= nextTweet.getDate().getTime());
            }
        }
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test Test");

        tweets.add(tweet);
        tweets.deleteTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }
}
