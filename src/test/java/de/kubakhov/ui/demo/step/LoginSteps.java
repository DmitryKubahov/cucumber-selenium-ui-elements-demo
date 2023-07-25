package de.kubakhov.ui.demo.step;

import de.kubakhov.ui.demo.element.common.input.action.InputUIElementActions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    @Autowired
    private WebDriver webDriver;

    @Given("User enters credentials")
    public void loginAsGuest(final InputUIElementActions uiElementActions) {
        uiElementActions.perform();
    }
}
