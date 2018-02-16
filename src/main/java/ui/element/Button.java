package ui.element;
import org.openqa.selenium.WebElement;


public class Button extends Element {
    public Button(WebElement webElement) {
        super(webElement);
    }

    public boolean isEnabled() {
        return getElement().isEnabled();
    }

    public boolean isSelected() {
        return getElement().isSelected();
    }

    public void click() {
        if (!getElement().isSelected()) {
            getElement().click();
        }
    }

    public void submit() {
        getElement().submit();
    }


}
