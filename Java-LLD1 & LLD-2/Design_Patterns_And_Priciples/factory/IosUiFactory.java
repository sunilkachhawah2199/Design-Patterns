package Design_Patterns_And_Priciples.factory;

import Design_Patterns_And_Priciples.factory.products.Button;
import Design_Patterns_And_Priciples.factory.products.IosButton;
import Design_Patterns_And_Priciples.factory.products.IosMenu;
import Design_Patterns_And_Priciples.factory.products.Menu;

public class IosUiFactory implements UiFactory {
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
    @Override
    public Button createButton() {
        return new IosButton();
    }
}
