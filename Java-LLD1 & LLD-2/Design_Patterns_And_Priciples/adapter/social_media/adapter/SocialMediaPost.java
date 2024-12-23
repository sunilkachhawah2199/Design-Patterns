package Design_Patterns_And_Priciples.adapter.social_media.adapter;

public class SocialMediaPost {
    String id;
    Long userId;
    String message;
    Long timestamp;

    public SocialMediaPost(String id, Long userId, String message, Long timestamp) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.timestamp = timestamp;
    }
}
