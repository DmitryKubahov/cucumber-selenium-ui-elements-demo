package de.kubakhov.ui.demo.step;

import de.kubakhov.ui.demo.element.common.input.action.InputUIElementActions;
import io.cucumber.java.en.Given;

public class LoginSteps {

    @Given("User enters credentials")
    public void loginAsGuest(final InputUIElementActions uiElementActions) {
        uiElementActions.perform();
    }
}
