package Design_Patterns_And_Priciples.factory;

import Design_Patterns_And_Priciples.factory.products.Button;
import Design_Patterns_And_Priciples.factory.products.Menu;

public interface UiFactory {
    Menu createMenu();
    Button createButton();
}
