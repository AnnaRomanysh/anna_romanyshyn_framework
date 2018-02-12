package ui.element;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;

import java.util.List;

public class Element implements IElement {
    private final WebElement element;

    public Element(final WebElement element) {
        this.element = element;
    }

    public WebElement getElement() {
        return element;
    }

    public void click() {
        element.click();
    }

    public void submit() {
        element.submit();
    }

    public void sendKeys(CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    public void clear() {
        element.clear();
    }

    public String getTagName() {
        return element.getTagName();
    }

    public String getAttribute(String name) {
        return element.getAttribute(name);
    }

    public boolean isSelected() {
        return element.isSelected();
    }

    public boolean isEnabled() {
        return element.isEnabled();
    }

    public String getText() {
        return element.getText();
    }

    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    public Point getLocation() {
        return element.getLocation();
    }

    public Dimension getSize() {
        return element.getSize();
    }

    public Rectangle getRect() {
        return element.getRect();
    }

    public String getCssValue(String propertyName) {
        return element.getCssValue(propertyName);
    }

    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return element.getScreenshotAs(target);
    }

    public Coordinates getCoordinates() {
        return ((Locatable) getElement()).getCoordinates();
    }

    public WebElement getWrappedElement() {
        return getElement();
    }
}
