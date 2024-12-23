package Design_Patterns_And_Priciples.adapter.social_media.adapter;

import Design_Patterns_And_Priciples.adapter.social_media.external.FacebookApi;
import Design_Patterns_And_Priciples.adapter.social_media.external.FacebookPost;

import java.util.ArrayList;
import java.util.List;

public class FacebookAdapter implements SocialMediaAdapter{
    FacebookApi api=new FacebookApi();
    @Override
    public List<SocialMediaPost> getPost(Long userId, Long timeStamp) {
        List<FacebookPost> fb=api.fetchFacebookPosts(userId, timeStamp);
        List<SocialMediaPost> social=new ArrayList<>();
        for(FacebookPost singleFb: fb){
            SocialMediaPost sp=new SocialMediaPost(singleFb.getId(), singleFb.getUserId(), singleFb.getStatus(), singleFb.getTimestamp());
            social.add(sp);
        }
        return social;
    }

    @Override
    public void postMessages(Long user, String messsage) {
        api.postFacebookStatus(user, messsage);
    }

}
