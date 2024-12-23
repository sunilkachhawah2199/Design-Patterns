package Design_Patterns_And_Priciples.adapter.social_media.adapter;

import Design_Patterns_And_Priciples.adapter.social_media.external.TwitterApi;
import Design_Patterns_And_Priciples.adapter.social_media.external.TwitterTweet;

import java.util.ArrayList;
import java.util.List;

public class TwitterAdapter implements SocialMediaAdapter{
    TwitterApi api=new TwitterApi();
    @Override
    public List<SocialMediaPost> getPost(Long userId, Long timeStamp) {
        List<TwitterTweet> twitts=api.getTweets(userId);
        List<SocialMediaPost> social=new ArrayList<>();
        for(TwitterTweet singleTwitte: twitts){
            SocialMediaPost sp=new SocialMediaPost(singleTwitte.getId(), singleTwitte.getUserId(), singleTwitte.getTweet(), 0L);
            social.add(sp);
        }
        return social;
    }

    @Override
    public void postMessages(Long user, String messsage) {
        api.tweet(user, messsage);
    }

}
