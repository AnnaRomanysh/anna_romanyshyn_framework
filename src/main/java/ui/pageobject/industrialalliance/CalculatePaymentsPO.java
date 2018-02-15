package ui.pageobject.industrialalliance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.element.*;

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

    @FindBy(xpath = "//*[contains(@for, 'Amortissement')]//..//*[contains(@class,'selectric-wrapper')]")
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

    public CalculatePaymentsPO typeIntoMortAmountORpurchePriceInput(String mortgageAmount) {
        info("Type: " + mortgageAmount + " into Mortrage amount/purchace price input");
        mortAmountAndPurchePriceInput.sendKeys(mortgageAmount);
        return this;
    }

    public CalculatePaymentsPO moveMortAmountORpurcePriceSliderToDefaultValue() {
        info("Move Mortrage amount/purchace price slider to default value");
        mortAmountAndPurchPriceSlider.moveByCoorginats(100, 0);
        return this;

    }

    public CalculatePaymentsPO moveDownPaymentSliderToDefaultValue() {
        info("Move Down Payment slider to default value");
      downPaymenSlider.moveByCoorginats(100, 0);
        return this;

    }

    public String getMortAmountORPurchePriceValue() {
        return mortAmountAndPurchPriceInnerInput.getAttribute("value");
    }

    public String getdownPaymenInnerValue() {
        return downPaymenInnerInput.getAttribute("value");
    }

    public CalculatePaymentsPO clearDownPaymentInput() {
        info("Clear down payment input");
        downPaymentInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeIntoDownPaymentInput(String downPayment) {
        info("Type: " + downPayment + " into down payment input");
        downPaymentInput.sendKeys(downPayment);
        return this;
    }

    public CalculatePaymentsPO selectAmortizationByVisibleText(String amortizationValue) {
        info("Select amortization: " + amortizationValue);
        amortizationDropdown.selectByVisibleText(amortizationValue);
        return this;
    }

    public CalculatePaymentsPO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
        info("Select payment frequency: " + paymentFrequency);
        paymentFrequencyDropdown.selectByVisibleText(paymentFrequency);
        return this;
    }

    public CalculatePaymentsPO clearInterestRateInput() {
        info("Clear interest rate input");
        interestRateInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeIntoInterestRateInput(String interestRate) {
        info("Type " + interestRate + " % into interest rate input");
        interestRateInput.sendKeys(interestRate);
        return this;
    }

    public CalculatePaymentsPO clickCalculateButton() {
        info("Click on Calculate button");
        calculateButton.click();
        return this;
    }

    public WebElement getPurchasePriceRadioValue() {
        return purchasePriceRadioValue;
    }

    public WebElement getMortgageAmountRadioValue() {
        return mortgageAmountRadioValue;
    }

    public WebElement getMortAmountAndPurchePriceInput() {
        return mortAmountAndPurchePriceInput;
    }

    public WebElement getDownPaymentInput() {
        return downPaymentInput;
    }

    public WebElement getMortAmountAndPurchPriceSlider() {
        return mortAmountAndPurchPriceSlider;
    }

    public WebElement getDownPaymenSlider() {
        return downPaymenSlider;
    }

    public WebElement getMortAmountAndPurchPriceInnerInput() {
        return mortAmountAndPurchPriceInnerInput;
    }

    public WebElement getDownPaymenInnerInput() {
        return downPaymenInnerInput;
    }

    public WebElement getDownPaymenError() {
        return downPaymenError;
    }

    public WebElement getAmortizationDropdown() {
        return amortizationDropdown;
    }

    public WebElement getSliderMiseDeFond() {
        return sliderMiseDeFond;
    }

    public WebElement getPaymentFrequencyDropdown() {
        return paymentFrequencyDropdown;
    }

    public WebElement getInterestRateInput() {
        return interestRateInput;
    }

    public WebElement getCalculateButton() {
        return calculateButton;
    }

    public WebElement getPaymentResult() {
        return paymentResult;
    }

//    public String getDropDownValue() {
//        return dropDownValue;
//    }
}
