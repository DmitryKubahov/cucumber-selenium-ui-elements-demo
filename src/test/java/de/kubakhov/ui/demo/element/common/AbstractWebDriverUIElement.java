package de.kubakhov.ui.demo.element.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Abstract UI element with web driver.
 */
public abstract class AbstractWebDriverUIElement {

    @Autowired
    protected WebDriver webDriver;
    @Autowired
    protected WebDriverWait webDriverWait;

    /**
     * Wait element until visibility.
     */
    protected void waitUntilVisibility(final By element) {
        this.webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    /**
     * Finds web element.
     */
    protected WebElement findElement(final By element) {
        return element.findElement(this.webDriver);
    }
}
