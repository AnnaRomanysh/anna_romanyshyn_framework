package ui.element;

import org.openqa.selenium.WebElement;
import ui.driver.Driver;

public class Slider extends Element {
    public Slider(WebElement webElement) {
        super(webElement);
    }

    public void moveTo(WebElement toElement) {
        Driver.actions().dragAndDrop(element, toElement).perform();

    }

    public void moveByCoorginats(int xOffSet, int yOffSet) {
        Driver.actions().dragAndDropBy(element, xOffSet, yOffSet).perform();

    }

}
