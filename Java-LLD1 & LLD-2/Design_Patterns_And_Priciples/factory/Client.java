package Design_Patterns_And_Priciples.factory;

import Design_Patterns_And_Priciples.factory.products.Button;
import Design_Patterns_And_Priciples.factory.products.Menu;

public class Client {
    public static void main(String[] args) {
        /* we can set this platfrom using
        1. hardcoded
        2. using environment variable
        3. using Constructor --> but client need to call constructor with platform
         */
        Platform platform=Platform.IOS;
        UiFactory uif= Flutter.getUiFactoryByPlatform(platform);
        Menu menu=uif.createMenu();
        menu.render();
        Button button=uif.createButton();
        button.click();
    }
}
