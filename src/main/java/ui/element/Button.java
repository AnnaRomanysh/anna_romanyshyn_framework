package ui.element;

import org.openqa.selenium.WebElement;


public class Button extends Element {
    public Button(WebElement webElement) {
        super(webElement);
    }


    public boolean isEnabled() {
        return element.isEnabled();
    }

    public boolean isSelected() {
        return element.isSelected();
    }
    public void click(){
        if(!getElement().isSelected()){
            getElement().click();
        }
    }


}
