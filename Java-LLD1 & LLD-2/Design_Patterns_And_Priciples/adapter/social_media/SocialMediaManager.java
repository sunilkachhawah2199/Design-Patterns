package Design_Patterns_And_Priciples.adapter.social_media;

import Design_Patterns_And_Priciples.adapter.social_media.adapter.SocialMediaAdapter;
import Design_Patterns_And_Priciples.adapter.social_media.external.Platform;


public class SocialMediaManager {
    Platform platformm=new Platform();


    public void getMessages(Long userId, Long timestamp, String platform) {
        SocialMediaAdapter ada=platformm.getSocialMedia(platform);
        ada.getPost(userId, timestamp);
    }
}
