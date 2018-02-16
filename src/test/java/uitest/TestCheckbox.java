package uitest;

import apitest.BaseTest;
import org.testng.annotations.Test;
import ui.driver.DriverManager;
import ui.pageobject.industrialalliance.ReqResBasePO;


public class TestCheckbox extends BaseTest {

    @Test
    public void test(){
        ReqResBasePO s = new ReqResBasePO();
       DriverManager.get("http://aurelia.io/docs/binding/checkboxes#booleans");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
