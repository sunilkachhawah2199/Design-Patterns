package Design_Patterns_And_Priciples.adapter.social_media.external;

import Design_Patterns_And_Priciples.adapter.social_media.adapter.FacebookAdapter;
import Design_Patterns_And_Priciples.adapter.social_media.adapter.SocialMediaAdapter;
import Design_Patterns_And_Priciples.adapter.social_media.adapter.TwitterAdapter;

public class Platform {
    public SocialMediaAdapter getSocialMedia(String platfrom) {
        if (platfrom.equals("Twitter")) {
            return new TwitterAdapter();
        } else if (platfrom.equals("Facebook")) {
            return new FacebookAdapter();
        }
        return null;
    }


}
