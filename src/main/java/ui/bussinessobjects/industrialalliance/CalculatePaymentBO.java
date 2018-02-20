package ui.bussinessobjects.industrialalliance;

import ui.pageobject.industrialalliance.CalculatePaymentsPO;

public class CalculatePaymentBO {

    CalculatePaymentsPO calculatePaymentsPO;

    public CalculatePaymentBO() {
        calculatePaymentsPO = new CalculatePaymentsPO()
    }


    public CalculatePaymentBO selectPurchasePriceRadioValue() {
        calculatePaymentsPO.clickPurchasePriceRadioValue();
        return this;
    }

    public CalculatePaymentBO selectMortgageAmountRadioValue() {
        calculatePaymentsPO.clickMortgageAmountRadioValue();
        return this;
    }

    public CalculatePaymentBO typeIntoMortAmountORpurchePriceInput(int mortgageAmount) {
        calculatePaymentsPO.clearMortAmountORpurchePriceInput()
                .typeMortAmountORpurchePriceInput(mortgageAmount);
        return this;
    }


    public CalculatePaymentBO moveMortAmountORpurcePriceSliderToDefaultValue() {
        calculatePaymentsPO.moveMortAmountORpurcePriceSliderToDefaultValue();
        return this;

    }

    public CalculatePaymentBO moveDownPaymentSliderToDefaultValue() {
        calculatePaymentsPO.moveDownPaymentSliderToDefaultValue();
        return this;

    }

//    public String getMortAmountORPurchePriceValue() {
//        return mortAmountAndPurchPriceInnerInput.getAttribute("value");
//    }
//
//    public String getdownPaymenInnerValue() {
//        return downPaymenInnerInput.getAttribute("value");
//    }
//
//    public CalculatePaymentsPO clearDownPaymentInput() {
//        info("Clear down payment input");
//        downPaymentInput.clear();
//        return this;
//    }
//
//    public CalculatePaymentsPO typeIntoDownPaymentInput(int downPayment) {
//        info("Type: " + downPayment + " into down payment input");
//        downPaymentInput.sendKeys(downPayment + "");
//        return this;
//    }
//
//    public CalculatePaymentsPO selectAmortizationByVisibleText(String amortizationValue) {
//        info("Select amortization: " + amortizationValue);
//        amortizationDropdown.selectByVisibleText(amortizationValue);
//        return this;
//    }
//
//    public CalculatePaymentsPO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
//        info("Select payment frequency: " + paymentFrequency);
//        paymentFrequencyDropdown.selectByVisibleText(paymentFrequency);
//        return this;
//    }
//
//    public CalculatePaymentsPO clearInterestRateInput() {
//        info("Clear interest rate input");
//        interestRateInput.clear();
//        return this;
//    }
//
//    public CalculatePaymentsPO typeIntoInterestRateInput(int interestRate) {
//        info("Type " + interestRate + " % into interest rate input");
//        interestRateInput.sendKeys(interestRate + "");
//        return this;
//    }
//
//    public CalculatePaymentsPO clickCalculateButton() {
//        info("Click on Calculate button");
//        calculateButton.click();
//        return this;
//    }
}
