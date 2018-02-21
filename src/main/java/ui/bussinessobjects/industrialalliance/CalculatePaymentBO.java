package ui.bussinessobjects.industrialalliance;

import models.ui.MortgagePaymentModel;
import ui.pageobject.industrialalliance.CalculatePaymentsPO;
import ui.pageobject.industrialalliance.ReqResBasePO;

public class CalculatePaymentBO {

    CalculatePaymentsPO calculatePaymentsPO;
    ReqResBasePO reqResBasePO;

    private final int sliderMoveToZero = -10000;
    private final int sliderMoveDefaultValue = 100;

    public CalculatePaymentBO() {
        calculatePaymentsPO = new CalculatePaymentsPO();
        reqResBasePO = new ReqResBasePO();
    }

    public CalculatePaymentBO  goToMortragePaymentCalculator(){
        reqResBasePO.openIndividualsTab()
                .clickLoans()
                .clickMortgagesLoan()
                .clickCalculatePayment();
        return this;
    }
    public void calculatePurchacePrice(MortgagePaymentModel mortgagePaymentModel) {
        selectPurchasePriceRadioValue()
                .typeIntoMortAmountORpurchePriceInput(mortgagePaymentModel.getPurchasePrice())
                .typeIntoDownPaymentInput(mortgagePaymentModel.getDownPayment());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectAmortizationByText(mortgagePaymentModel.getAmortization())
                .selectPaymentFrequencyByVisibleText(mortgagePaymentModel.getPaymentFrequency())
                .typeIntoInterestRateInput(mortgagePaymentModel.getInterestRate())
                .clickOnCalculateButton();

    }
    public void calculateMortrageAmount(MortgagePaymentModel mortgagePaymentModel) {
        selectPurchasePriceRadioValue()
                .typeIntoMortAmountORpurchePriceInput(mortgagePaymentModel.getPurchasePrice())
                .selectAmortizationByText(mortgagePaymentModel.getAmortization())
                .selectPaymentFrequencyByVisibleText(mortgagePaymentModel.getPaymentFrequency())
                .typeIntoInterestRateInput(mortgagePaymentModel.getInterestRate())
                .clickOnCalculateButton();

    }

    public CalculatePaymentBO selectPurchasePriceRadioValue() {
        calculatePaymentsPO.clickPurchasePriceRadioValue();
        return this;
    }

    public boolean isPurchasePriceRadioValueSelected() {
        return calculatePaymentsPO.getPurchasePriceRadioValue().isSelected();
    }

    public CalculatePaymentBO selectMortgageAmountRadioValue() {
        calculatePaymentsPO.clickMortgageAmountRadioValue();
        return this;
    }

    public CalculatePaymentBO isMortgageAmountRadioValueSelected() {
        calculatePaymentsPO.getMortgageAmountRadioValue().isSelected();
        return this;
    }

    public CalculatePaymentBO typeIntoMortAmountORpurchePriceInput(int mortgageAmount) {
        calculatePaymentsPO.clearMortAmountORpurchePriceInput()
                .typeMortAmountORpurchePriceInput(mortgageAmount);
        return this;
    }

    public CalculatePaymentBO typeIntoDownPaymentInput(int downPayment) {
        calculatePaymentsPO.clearDownPaymentInput()
                .typeDownPaymentInput(downPayment);
        return this;
    }

    public boolean isMortAmountORpurcePriceSliderMovable() {
        if (calculatePaymentsPO.getMortAmountORPurchePriceValue() > 0) {
            calculatePaymentsPO.moveMortAmountORpurcePriceSliderToValue(sliderMoveToZero);
        }
        calculatePaymentsPO.moveMortAmountORpurcePriceSliderToValue(sliderMoveDefaultValue);
        return calculatePaymentsPO.getMortAmountORPurchePriceValue() > 0;
    }

    public boolean isDownPaymentSliderMovable() {
        if (calculatePaymentsPO.getdownPaymenValue() > 0) {
            calculatePaymentsPO.moveDownPaymentSliderToValue(sliderMoveToZero);
        }
        calculatePaymentsPO.moveDownPaymentSliderToValue(sliderMoveDefaultValue);
        return calculatePaymentsPO.getdownPaymenValue() > 0;
    }


    public CalculatePaymentBO selectAmortizationByText(String amortizationValue) {
        calculatePaymentsPO.selectAmortizationByVisibleText(amortizationValue);
        return this;
    }

    public CalculatePaymentBO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
        calculatePaymentsPO.selectPaymentFrequencyByVisibleText(paymentFrequency);
        return this;
    }

    public CalculatePaymentBO typeIntoInterestRateInput(int interestRate) {
        calculatePaymentsPO.clearInterestRateInput()
                .typeInterestRateInput(interestRate);
        return this;
    }

    public CalculatePaymentBO clickOnCalculateButton() {
        calculatePaymentsPO.clickCalculateButton();
        return this;
    }

    public String getResult() {
        return calculatePaymentsPO.getPaymentResult().getText();

    }

}
