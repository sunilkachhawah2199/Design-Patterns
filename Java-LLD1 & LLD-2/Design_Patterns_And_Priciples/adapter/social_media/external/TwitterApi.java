package Design_Patterns_And_Priciples.adapter.social_media.external;

import java.util.List;

public class TwitterApi {
    public List<TwitterTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        return List.of(new TwitterTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        System.out.println("Tweeted on Twitter");
    }
}
