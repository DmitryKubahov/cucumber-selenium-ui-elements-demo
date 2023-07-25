package de.kubakhov.ui.demo.element.signin;

import de.kubakhov.ui.demo.element.common.AbstractWebDriverUIElement;
import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component("SignIn")
public class SignInUIElement extends AbstractWebDriverUIElement implements InputUIElement {

    private final static By SIGN_IN_BUTTON_LOCATOR = By.className("p-button-label");

    @Override
    public void setValue(final String rememberMe) {
        waitUntilVisibility(SIGN_IN_BUTTON_LOCATOR);
        final var signInButton = findElement(SIGN_IN_BUTTON_LOCATOR);
        signInButton.click();
    }
}
