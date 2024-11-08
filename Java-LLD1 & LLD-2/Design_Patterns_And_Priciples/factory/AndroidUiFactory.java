package Design_Patterns_And_Priciples.factory;

import Design_Patterns_And_Priciples.factory.products.AndroidButton;
import Design_Patterns_And_Priciples.factory.products.AndroidMenu;
import Design_Patterns_And_Priciples.factory.products.Button;
import Design_Patterns_And_Priciples.factory.products.Menu;

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
