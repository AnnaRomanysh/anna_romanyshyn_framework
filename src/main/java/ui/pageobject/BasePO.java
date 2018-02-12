package ui.pageobject;

import org.openqa.selenium.support.PageFactory;
import ui.driver.Driver;
import ui.element.FieldDecorator;
import utils.TestLogger;

public class BasePO {


    public BasePO() {
        PageFactory.initElements(new FieldDecorator(Driver.getDriver()), this);

    }

    public void info(String message) {
        TestLogger.info(message);
    }
}
