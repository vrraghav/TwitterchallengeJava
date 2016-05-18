package com.tweetfeedreader;


import com.twitter.TwitterAPI;
import com.twitter.TwitterTweet;
import com.tweet.constants.TweetConstants;
import java.util.ArrayList;

public class TwitterAsyncTask  {
	
    public static ArrayList<TwitterTweet> AsyncCallBackground() {
        ArrayList<TwitterTweet> twitterTweets = null;
            TwitterAPI twitterAPI = new TwitterAPI(TweetConstants.CONSUMER_KEY,TweetConstants.CONSUMER_SECRET);
            twitterTweets = twitterAPI.getTwitterTweets(TweetConstants.SCREEN_NAME);
        return twitterTweets;
    }
}
