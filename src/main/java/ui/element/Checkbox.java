package ui.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;


public class Checkbox extends Element {
    public Checkbox(WebElement webElement) {
        super(webElement);
    }

    private String checkboxValePath = ".//label//preceding-sibling::input";

    public boolean isChecked() {
        return element.isSelected();
    }

    public void check() {
        if (!isChecked()) {
            element.click();
        }
    }

    public void unCheck() {
        if (isChecked()) {
            element.click();
        }
    }
//.//ancestor::label
    public void deselectAll() {

        getWrappedElement().findElements(By.xpath(".//input")).forEach(el -> {

            if (el.isSelected()) {
                el.click();
            }
        });
    }

    public void selectAll() {
        getElement().findElements(By.xpath(".//input")).forEach(el -> {
            if (!el.isSelected()) {
                el.click();
            }
        });
    }

    public void checkByValues(String... values) {
        List<String> valueList = Arrays.asList(values);
        List<WebElement> checkboxLabels = getElement().findElements(By.xpath(".//label"));
        if (values.length > 0) {
            checkboxLabels.forEach(label -> valueList.forEach(value -> {
                if (label.getText().equalsIgnoreCase(value) && !label.isSelected()) {
                    label.click();
                }
            }));
        } else {
            throw new IllegalArgumentException("Values to check should be defined");
        }

    }


}
