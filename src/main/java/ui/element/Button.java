package ui.element;
import org.openqa.selenium.WebElement;


public class Button extends Element {
    public Button(WebElement webElement) {
        super(webElement);
    }

    public void click(){
        element.click();
    }
    public boolean isInabled(){
       return element.isEnabled();
    }

}
