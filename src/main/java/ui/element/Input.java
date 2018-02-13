package ui.element;

import org.openqa.selenium.WebElement;

public class Input extends Element {
    public Input(WebElement element) {
        super(element);
    }

    public void sendKeys(CharSequence... charSequences) {
        getWrappedElement().sendKeys(charSequences);
    }

    public void clear() {
        getWrappedElement().clear();
    }
}
