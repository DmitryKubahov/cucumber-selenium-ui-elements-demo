package de.kubakhov.ui.demo.element.signin;

import de.kubakhov.ui.demo.element.common.AbstractWebDriverUIElement;
import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component("Remember me")
public class RemenberMeUIElement extends AbstractWebDriverUIElement implements InputUIElement {

    private final static By REMEMBER_ME_FIELD_LOCATOR = By.id("rememberme1");

    @Override
    public void setValue(final String rememberMe) {
        waitUntilVisibility(REMEMBER_ME_FIELD_LOCATOR);
        final var rememberMeElement = findElement(REMEMBER_ME_FIELD_LOCATOR);
        rememberMeElement.click();
    }
}
