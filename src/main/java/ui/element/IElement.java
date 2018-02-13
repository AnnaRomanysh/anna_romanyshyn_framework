package ui.element;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

import java.util.List;

public interface IElement extends WebElement, WrapsElement, Locatable {
    @Override
    default void click() {

    }

    @Override
    default void submit() {

    }

    @Override
    default void sendKeys(CharSequence... keysToSend) {

    }

    @Override
    default void clear() {

    }

    @Override
    default String getTagName() {
        return null;
    }

    @Override
    default String getAttribute(String name) {
        return null;
    }

    @Override
    default boolean isSelected() {
        return false;
    }

    @Override
    default boolean isEnabled() {
        return false;
    }

    @Override
    default String getText() {
        return null;
    }

    @Override
    default List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    default WebElement findElement(By by) {
        return null;
    }

    @Override
    default boolean isDisplayed() {
        return false;
    }

    @Override
    default Point getLocation() {
        return null;
    }

    @Override
    default Dimension getSize() {
        return null;
    }

    @Override
    default Rectangle getRect() {
        return null;
    }

    @Override
    default String getCssValue(String propertyName) {
        return null;
    }

    @Override
    default <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return null;
    }

    @Override
    default Coordinates getCoordinates() {
        return null;
    }

    @Override
    default WebElement getWrappedElement() {
        return null;
    }
}
