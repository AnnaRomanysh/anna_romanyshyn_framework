package ui.pageobject.industrialalliance;

import org.openqa.selenium.support.FindBy;
import ui.element.*;
import ui.wait.Wait;

public class CalculatePaymentsPO extends ReqResBasePO {

    @FindBy(xpath = "//input[@id='par_valeur']")
    private Button purchasePriceRadioValue;

    @FindBy(xpath = "//input[@id='par_pret']")
    private Button mortgageAmountRadioValue;

    @FindBy(xpath = "//input[@id='PrixPropriete']")
    private Input mortAmountAndPurchePriceInput;

    @FindBy(xpath = "//input[@id='MiseDeFond']")
    private Input downPaymentInput;

    @FindBy(xpath = "//*[@name='PrixPropriete']//../..//*[contains(@class,'min-slider-handle')]")
    private Slider mortAmountAndPurchPriceSlider;

    @FindBy(xpath = "//*[@name='MiseDeFond']//../..//*[contains(@class,'min-slider-handle')]")
    private Slider downPaymenSlider;

    @FindBy(xpath = "//*[@id='sliderPrixPropriete']")
    private Input mortAmountAndPurchPriceInnerInput;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private Input downPaymenInnerInput;

    @FindBy(xpath = "//*[@id='MiseDeFond_error']")
    private TextArea downPaymenError;

    @FindBy(xpath = "//*[contains(@for, 'Amortissement')]//..//*[@class='selectric']")
    private DropDown amortizationDropdown;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private TextArea sliderMiseDeFond;

    @FindBy(xpath = "//*[contains(@for, 'FrequenceVersement')]//following::*[@class='selectric']")
    private DropDown paymentFrequencyDropdown;

    @FindBy(xpath = "//*[@id='TauxInteret']")
    private Input interestRateInput;

    @FindBy(xpath = " //*[@id='btn_calculer']")
    private Button calculateButton;

    @FindBy(xpath = "//*[@id='paiement-resultats']")
    private TextArea paymentResult;



    public CalculatePaymentsPO clickPurchasePriceRadioValue() {
        info("Choose 'Purchase price' radio value ");
        purchasePriceRadioValue.click();
        return this;
    }

    public CalculatePaymentsPO clickMortgageAmountRadioValue() {
        info("Choose 'Mortgage amount' radio value ");
        mortgageAmountRadioValue.click();
        return this;
    }

    public CalculatePaymentsPO clearMortAmountORpurchePriceInput() {
        info("Clear Mortrage amount/purchace price input");
        mortAmountAndPurchePriceInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeMortAmountORpurchePriceInput(int mortgageAmount) {
        info("Type: " + mortgageAmount + " into Mortrage amount/purchace price input");
        mortAmountAndPurchePriceInput.sendKeys(mortgageAmount + "");
        return this;
    }

    public CalculatePaymentsPO moveMortAmountORpurcePriceSliderToValue(int value) {
        info("Move Mortrage amount/purchace price slider to default value");
        mortAmountAndPurchPriceSlider.moveByCoorginats(value, 0);
        return this;

    }

    public CalculatePaymentsPO moveDownPaymentSliderToValue(int value) {
        info("Move Down Payment slider to default value");
        downPaymenSlider.moveByCoorginats(value, 0);
        return this;

    }

    public int getMortAmountORPurchePriceValue() {
        return Integer.parseInt(mortAmountAndPurchPriceInnerInput.getAttribute("value"));
    }

    public int getdownPaymenValue() {
        return Integer.parseInt(downPaymenInnerInput.getAttribute("value"));
    }

    public CalculatePaymentsPO clearDownPaymentInput() {
        info("Clear down payment input");
        downPaymentInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeDownPaymentInput(int downPayment) {
        info("Type: " + downPayment + " into down payment input");
        downPaymentInput.sendKeys(downPayment + "");
        return this;
    }

    public CalculatePaymentsPO selectAmortizationByVisibleText(String amortizationValue) {
        info("Select amortization: " + amortizationValue);
        Wait.waitToBeVisible(30, amortizationDropdown);
        amortizationDropdown.selectByVisibleText(amortizationValue);
        return this;
    }

    public CalculatePaymentsPO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
        info("Select payment frequency: " + paymentFrequency);
        Wait.waitToBeVisible(30, paymentFrequencyDropdown);
        paymentFrequencyDropdown.selectByVisibleText(paymentFrequency);
        return this;
    }

    public CalculatePaymentsPO clearInterestRateInput() {
        info("Clear interest rate input");
        interestRateInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeInterestRateInput(int interestRate) {
        info("Type " + interestRate + " % into interest rate input");
        interestRateInput.sendKeys(interestRate + "");
        return this;
    }

    public CalculatePaymentsPO clickCalculateButton() {
        info("Click on Calculate button");
        calculateButton.click();
        return this;
    }

    public Button getPurchasePriceRadioValue() {
        return purchasePriceRadioValue;
    }

    public Button getMortgageAmountRadioValue() {
        return mortgageAmountRadioValue;
    }

    public Input getMortAmountAndPurchePriceInput() {
        return mortAmountAndPurchePriceInput;
    }

    public Input getDownPaymentInput() {
        return downPaymentInput;
    }

    public Slider getMortAmountAndPurchPriceSlider() {
        return mortAmountAndPurchPriceSlider;
    }

    public Slider getDownPaymenSlider() {
        return downPaymenSlider;
    }

    public Input getMortAmountAndPurchPriceInnerInput() {
        return mortAmountAndPurchPriceInnerInput;
    }

    public Input getDownPaymenInnerInput() {
        return downPaymenInnerInput;
    }

    public TextArea getDownPaymenError() {
        return downPaymenError;
    }

    public DropDown getAmortizationDropdown() {
        return amortizationDropdown;
    }

    public TextArea getSliderMiseDeFond() {
        return sliderMiseDeFond;
    }

    public DropDown getPaymentFrequencyDropdown() {
        return paymentFrequencyDropdown;
    }

    public Input getInterestRateInput() {
        return interestRateInput;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public TextArea getPaymentResult() {
        Wait.waitToBeVisible(30, paymentResult);
        return paymentResult;
    }
}
