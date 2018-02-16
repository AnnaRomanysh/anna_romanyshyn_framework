package ui.element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ui.driver.DriverManager;

import java.util.List;

public class DropDown extends Element {

    public DropDown(WebElement webElement) {
        super(webElement);
    }


    private String dropDownValue = "./..//li[normalize-space()='%s']";


    public void selectByVisibleText(String text) {
        if(isSelectType()==true){
            new Select(getElement()).selectByVisibleText(text);
        }
        else {
           DriverManager.executeScript("arguments[0].click();", getElement());
            getElement().findElement(By.xpath(dropDownValue.replace("%s", text))).click();
        }


    }

    public void selectByIndex(int index) {
        if(isSelectType()==true) {
            new Select(getElement()).selectByIndex(index);
        }
        else {
            getElement().click();
            getElement().findElements(By.xpath("./..//li")).get(index).click();
        }

    }

    public void selectByValue(String attribitename, String value) {
        if(isSelectType()==true) {
            new Select(getElement()).selectByValue(value);
        }
        else{
            getElement().click();
            getElement().findElements(By.xpath("./..//li")).stream().filter(el->el.getAttribute(attribitename).equals(value)).findFirst().get().click();

        }
    }

    public boolean isMultiple() {
            return new Select(getElement()).isMultiple();

    }

    public void deselectAll() {
        new Select(getElement()).deselectAll();
    }

    public void deselectByValue(String value) {
        new Select(getElement()).deselectByValue(value);
    }

    public void deselectByIndex(int index) {
        new Select(getElement()).deselectByIndex(index);
    }

    public void deselectByVisibleText(String text) {
        new Select(getElement()).deselectByVisibleText(text);
    }

    public boolean isSelected() {
        return (getElement()).isSelected();
    }

    public List<WebElement> getOptions() {
        return new Select(getElement()).getOptions();
    }

    public boolean isSelectType() {
      return   getElement().getTagName().equalsIgnoreCase("Select");
    }


}
