package Design_Patterns_And_Priciples.adapter.social_media.adapter;

import java.util.List;

public interface SocialMediaAdapter{
    public List<SocialMediaPost> getPost(Long userId, Long timeStamp);
    public void postMessages(Long user, String messsage);
}
