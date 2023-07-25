package de.kubakhov.ui.demo.element.signin;

import de.kubakhov.ui.demo.element.common.AbstractWebDriverUIElement;
import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component("Password")
public class PasswordUIElement extends AbstractWebDriverUIElement implements InputUIElement {

    private final static By PASSWORD_FIELD_LOCATOR = By.id("password1");

    @Override
    public void setValue(final String passwordToSet) {
        waitUntilVisibility(PASSWORD_FIELD_LOCATOR);
        final var passwordElement = findElement(PASSWORD_FIELD_LOCATOR);
        passwordElement.sendKeys(passwordToSet);
    }
}
