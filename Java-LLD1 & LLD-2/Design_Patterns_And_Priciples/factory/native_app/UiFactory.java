package Design_Patterns_And_Priciples.factory.native_app;

import Design_Patterns_And_Priciples.factory.native_app.products.Button;
import Design_Patterns_And_Priciples.factory.native_app.products.Menu;

// here Ui Factory is abstract factory which is used to store all the factory method.
public interface UiFactory {
    Menu createMenu();
    Button createButton();
}
