package de.kubakhov.ui.demo.element.pause;

import de.kubakhov.ui.demo.element.common.AbstractWebDriverUIElement;
import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

import java.time.Duration;

@ScenarioScope
@Component("Pause")
public class PauseUIElement extends AbstractWebDriverUIElement implements InputUIElement {

    @Override
    public void setValue(final String duration) {
        new Actions(this.webDriver)
                .pause(Duration.ofSeconds(Integer.parseInt(duration)))
                .perform();
    }
}