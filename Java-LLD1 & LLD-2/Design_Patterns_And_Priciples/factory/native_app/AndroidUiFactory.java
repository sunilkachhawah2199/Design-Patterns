package Design_Patterns_And_Priciples.factory.native_app;

import Design_Patterns_And_Priciples.factory.native_app.products.AndroidButton;
import Design_Patterns_And_Priciples.factory.native_app.products.AndroidMenu;
import Design_Patterns_And_Priciples.factory.native_app.products.Button;
import Design_Patterns_And_Priciples.factory.native_app.products.Menu;

public class AndroidUiFactory implements UiFactory{

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
