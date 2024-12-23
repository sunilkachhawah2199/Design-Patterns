package Design_Patterns_And_Priciples.factory.native_app;

import Design_Patterns_And_Priciples.factory.native_app.products.Button;
import Design_Patterns_And_Priciples.factory.native_app.products.IosButton;
import Design_Patterns_And_Priciples.factory.native_app.products.IosMenu;
import Design_Patterns_And_Priciples.factory.native_app.products.Menu;

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
