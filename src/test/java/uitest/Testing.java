package uitest;

import apitest.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import ui.driver.Driver;

import ui.pageobject.industrialalliance.ReqResBasePO;


public class Testing extends BaseTest {

    @Test
    public void test() {

        Driver.getDriver().get("https://ia.ca/individuals");

        ReqResBasePO main = new ReqResBasePO();
        main.openIndividualsTab()
                .clickLoans()
                .clickMortgagesLoan()
                .clickCalculatePayment()
                .clickMortgageAmountRadioValue()
                .clickPurchasePriceRadioValue()
                .clearMortAmountORpurchePriceInput()
                .typeIntoMortAmountORpurchePriceInput("1293073")
                .typeIntoDownPaymentInput("50")
                .selectAmortizationByVisibleText("15 years")
                .typeIntoInterestRateInput("6")
                .clickCalculateButton()
                .getDownPaymenError();
//

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
