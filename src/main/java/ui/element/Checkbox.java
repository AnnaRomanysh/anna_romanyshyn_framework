package ui.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;


public class Checkbox extends Element {
    private List<String> valueList;
    private List<WebElement> checkboxLabels;
    private List<WebElement> checkboxInputs;

    public Checkbox(WebElement webElement) {
        super(webElement);
    }

    private String checkboxValePath = ".//label//preceding-sibling::input";

    public boolean isChecked() {
        return getElement().isSelected();
    }

    public void check() {
        if (!isChecked()) {
            getElement().click();
        }
    }

    public void unCheck() {
        if (isChecked()) {
            getElement().click();
        }
    }

    public void checktAll() {
        getWrappedElement().findElements(By.xpath(".//input")).forEach(el -> {
            if (el.isSelected()) {
                el.click();
            }
        });
    }

    public void unChecktAll() {
        getElement().findElements(By.xpath(".//input")).forEach(el -> {
            if (!el.isSelected()) {
                el.click();
            }
        });
    }

    public void checkByValues(String... values) {
        valueList = Arrays.asList(values);
        checkboxLabels = getElement().findElements(By.xpath(".//label"));
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

    public void checkByIndexes(int... indexes) {
        checkboxInputs = getElement().findElements(By.xpath(".//input"));
        if (indexes.length > 0) {
            for (int i = 0; i < indexes.length; i++) {
                if (!checkboxInputs.get(indexes[i]).isSelected()) {
                    checkboxInputs.get(indexes[i]).click();
                }
            }

        } else {
            throw new IllegalArgumentException("Indexes to check should be defined");
        }

    }

    public void unCheckByValues(String... values) {
        valueList = Arrays.asList(values);
        checkboxLabels = getElement().findElements(By.xpath(".//label"));
        if (values.length > 0) {
            checkboxLabels.forEach(label -> valueList.forEach(value -> {
                if (label.getText().equalsIgnoreCase(value) && label.findElement(By.xpath(".//..//input")).isSelected()) {
                    label.click();
                }
            }));
        } else {
            throw new IllegalArgumentException("Values to unCheck should be defined");
        }
    }

    public void unCheckByIndexes(int... indexes) {
        checkboxInputs = getElement().findElements(By.xpath(".//input"));
        if (indexes.length > 0) {
            for (int i = 0; i < indexes.length; i++) {
                if (checkboxInputs.get(indexes[i]).isSelected()) {
                    checkboxInputs.get(indexes[i]).click();
                }
            }
        } else {
            throw new IllegalArgumentException("Indexes to unCheck should be defined");
        }


    }


}
