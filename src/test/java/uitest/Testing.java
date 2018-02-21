package uitest;

import apitest.BaseTest;
import models.ui.MortgagePaymentModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.bussinessobjects.industrialalliance.CalculatePaymentBO;
import ui.driver.DriverManager;
import ui.pageobject.industrialalliance.ReqResBasePO;


public class Testing extends BaseTest {
    CalculatePaymentBO calculatePaymentBO;
    MortgagePaymentModel mortgagePaymentModel;

    @Test
    public void checkPurchacePriceSliderWorks() {
        DriverManager.get("https://ia.ca/individuals");
        calculatePaymentBO = new CalculatePaymentBO();
        info("Verify purchace price slider works");
        calculatePaymentBO.goToMortragePaymentCalculator();
        Assert.assertTrue(calculatePaymentBO.isMortAmountORpurcePriceSliderMovable(), "Purchace price slider doesn't work");

    }

    @Test
    public void checkDownPaymentSliderWorks() {
        info("Verify down payment slider works");
        calculatePaymentBO.goToMortragePaymentCalculator();
        Assert.assertTrue(calculatePaymentBO.isDownPaymentSliderMovable(), "Down payment slider doesn't work");

    }

    @Test
    public void checkPaymentCalucation() {

        DriverManager.get("https://ia.ca/individuals");
        calculatePaymentBO = new CalculatePaymentBO();
        MortgagePaymentModel mortgagePaymentModel = new MortgagePaymentModel(500000, "15 years", "weekly", 5  );
        mortgagePaymentModel.setDownPayment(50000);
        info("Verify down payment slider works");
        calculatePaymentBO.goToMortragePaymentCalculator();

        calculatePaymentBO.calculatePurchacePrice(mortgagePaymentModel);
        Assert.assertEquals(calculatePaymentBO.getResult(), "$ 842.47");


    }


    @Test
    public void test() {
        DriverManager.get("https://ia.ca/individuals");

        ReqResBasePO main = new ReqResBasePO();
        CalculatePaymentBO calculatePaymentBO = new CalculatePaymentBO();

        main.openIndividualsTab()
                .clickLoans()
                .clickMortgagesLoan()
                .clickCalculatePayment()
                .clickMortgageAmountRadioValue()
                .clickPurchasePriceRadioValue()
                .clearMortAmountORpurchePriceInput()
                .typeMortAmountORpurchePriceInput(1000000)
                .selectPaymentFrequencyByVisibleText("weekly");
        calculatePaymentBO.isMortAmountORpurcePriceSliderMovable();
        System.out.println(calculatePaymentBO.isMortAmountORpurcePriceSliderMovable());
//                .typeMortAmountORpurchePriceInput(1293073)
//                .typeDownPaymentInput(50)
//                .selectAmortizationByVisibleText("15 years")
//                .clearInterestRateInput()
//                .typeInterestRateInput(6)
//                .clickCalculateButton()
//                .getDownPaymenError();

//

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test1() {

        DriverManager.get("https://ia.ca/individuals");

        ReqResBasePO main = new ReqResBasePO();
        main.openIndividualsTab()
                .clickLoans()
                .clickMortgagesLoan()
                .clickCalculatePayment()
                .clickMortgageAmountRadioValue()
                .clickPurchasePriceRadioValue()
                .clearMortAmountORpurchePriceInput()
                .typeMortAmountORpurchePriceInput(1293073)
                .typeDownPaymentInput(50)
                .selectAmortizationByVisibleText("15 years")
                .typeInterestRateInput(6)
                .clickCalculateButton()
                .getDownPaymenError();

//

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
//    @Test
//    public void test2() {
//
//        DriverManager.get("https://ia.ca/individuals");
//
//        ReqResBasePO main = new ReqResBasePO();
//        main.openIndividualsTab()
//                .clickLoans()
//                .clickMortgagesLoan()
//                .clickCalculatePayment()
//                .clickMortgageAmountRadioValue()
//                .clickPurchasePriceRadioValue()
//                .clearMortAmountORpurchePriceInput()
//                .typeIntoMortAmountORpurchePriceInput("1293073")
//                .typeIntoDownPaymentInput("50")
//                .selectAmortizationByVisibleText("15 years")
//                .typeIntoInterestRateInput("6")
//                .clickCalculateButton()
//                .getDownPaymenError();
//
////
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//    }


}
