package de.kubakhov.ui.demo.element.common.input.transformer;

import de.kubakhov.ui.demo.element.common.input.InputUIElement;
import de.kubakhov.ui.demo.element.common.input.action.InputUIElementActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import org.openqa.selenium.interactions.Action;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

public class DataTableToUserInputUIElementsTransformer {

    @Autowired
    private Map<String, InputUIElement> uiElements;

    @DataTableType
    public InputUIElementActions toUIElementActions(final DataTable table) {
        final var userInputUIElementAction = new InputUIElementActions();
        table.entries()
             .stream()
             .map(row -> {
                 final var elementName = row.get("element");
                 final var valueToSet = row.get("value");
                 final var uiElement = Optional.ofNullable(this.uiElements.get(elementName))
                                               .orElseThrow(() -> new NoSuchElementException("Could not find UI element by name: %s".formatted(elementName)));
                 return (Action) () -> uiElement.setValue(valueToSet);

             })
             .forEach(userInputUIElementAction::addAction);
        return userInputUIElementAction;
    }
}
