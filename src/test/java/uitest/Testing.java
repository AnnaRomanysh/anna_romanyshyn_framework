package uitest;

import apitest.BaseTest;
import org.openqa.selenium.Keys;
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
        main.openIndividualsTab()
                .clickLoans()
                .clickMortgage()
                .clickCalculatePayment()
                .clickPurchasePriceRadioValue()
                .clearMortAmountAndPurchePriceInput()
                .typeIntoMortAmountAndPurchePriceInput("100000")
                .typeIntoMortAmountAndPurchePriceInput(Keys.ENTER);


//        main.clickLoans()
//                .clickMortgage()
//                .clickCalculatePayment()
//                .selectAmortizationByVisibleText("15 years")
//                .selectPaymentFrequencyByVisibleText("Biweekly +")
//                .typeIntoInterestRateInput("5")
//                .moveMortAmountAndPurcePriceSliderToDefaultValue()
//                .getMortAmountAndPurchePriceValue();

//
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
