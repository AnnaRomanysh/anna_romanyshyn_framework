package uitest;

import apitest.BaseTest;
import org.testng.annotations.Test;
import ui.driver.Driver;
import ui.pageobject.industrialalliance.ReqResBasePO;

public class TestCheckbox extends BaseTest {

    @Test
    public void test(){
        ReqResBasePO s = new ReqResBasePO();
        Driver.getDriver().get("https://ant.design/components/checkbox");

        s.b();
//        s.a("Orange", "Pear");
    }

}
