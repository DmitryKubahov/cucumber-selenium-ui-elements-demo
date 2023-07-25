package de.kubakhov.ui.demo.element.signin;

import de.kubakhov.ui.demo.element.common.AbstractWebDriverUIElement;
import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@ScenarioScope
@Component("Email")
public class EmailUIElement extends AbstractWebDriverUIElement implements InputUIElement {

    private final static By EMAIL_FIELD_LOCATOR = By.id("email1");

    @Override
    public void setValue(final String emailToSet) {
        waitUntilVisibility(EMAIL_FIELD_LOCATOR);
        final var emailElement = findElement(EMAIL_FIELD_LOCATOR);
        emailElement.sendKeys(emailToSet);
    }
}
