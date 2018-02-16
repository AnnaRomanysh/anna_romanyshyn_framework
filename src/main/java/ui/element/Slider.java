package ui.element;

import org.openqa.selenium.WebElement;
import ui.driver.DriverManager;

public class Slider extends Element {
    public Slider(WebElement webElement) {
        super(webElement);
    }

    public void moveTo(WebElement toElement) {
        DriverManager.actions().dragAndDrop(getElement(), toElement).perform();

    }

    public void moveByCoorginats(int xOffSet, int yOffSet) {
        DriverManager.actions().dragAndDropBy(getElement(), xOffSet, yOffSet).perform();

    }

}
