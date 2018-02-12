package uitest;

import apitest.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import ui.driver.Driver;

import ui.pageobject.industrialalliance.ReqResBasePO;


public class Testing extends BaseTest {

    @Test
    public void test() {


//    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
        Driver dr = new Driver();
        dr.getDriver();

//    dr.maximize();
        dr.get("https://ia.ca/individuals");

        ReqResBasePO main = new ReqResBasePO();
        main.openIndividualsTab()
                .clickLoans()
                .clickMortgagesLoan()
                .clickCalculatePayment()
                .clickPurchasePriceRadioValue()
                .clearMortAmountORpurchePriceInput()
                .typeIntoMortAmountORpurchePriceInput("1293073")
                .typeIntoDownPaymentInput("50")
                .clickCalculateButton()
                .getDownPaymenError();



//        main.clickLoans()
//                .clickMortgage()
//                .clickCalculatePayment()
//                .selectAmortizationByVisibleText("15 years")
//                .selectPaymentFrequencyByVisibleText("Biweekly +")
//                .typeIntoInterestRateInput("5")
//                .moveMortAmountAndPurcePriceSliderToDefaultValue()
//                .getMortAmountAndPurchePriceValue();

//


    }


}
