package uitest;

import apitest.BaseTest;
import org.testng.annotations.Test;
import ui.driver.Driver;
import ui.pageobject.industrialalliance.MainPO;


public class Testing extends BaseTest {

    @Test
    public void test() {


//    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
        Driver dr = new Driver();
        dr.getDriver();

//    dr.maximize();
        dr.get("https://ia.ca/individuals");

        MainPO main = new MainPO();
        main.clickLoans()
                .clickMortgage()
                .clickCalculatePayment()
                .typeIntoMortgageAmountInput("10000000");

        main.typeIntoDownPaymentInput("5000");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
