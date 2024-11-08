package Design_Patterns_And_Priciples.factory;

public class Flutter {
    // static constructor
    public static UiFactory getUiFactoryByPlatform(Platform platform) {
        if (platform == Platform.IOS) {
            return new IosUiFactory();
        } else if (platform == Platform.ANDROID) {
            return new AndroidUiFactory();
        }
        return null;
    }
}
