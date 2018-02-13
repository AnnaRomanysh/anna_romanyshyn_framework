package ui.pageobject.industrialalliance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.driver.Driver;
import ui.element.DropDown;
import ui.element.Element;
import ui.element.Input;

public class CalculatePaymentsPO extends ReqResBasePO {

    @FindBy(xpath = "//input[@id='par_valeur']")
    private Element purchasePriceRadioValue;

    @FindBy(xpath = "//input[@id='par_pret']")
    private Element mortgageAmountRadioValue;

    @FindBy(xpath = "//input[@id='PrixPropriete']")
    private Element mortAmountAndPurchePriceInput;

    @FindBy(xpath = "//input[@id='MiseDeFond']")
    private Element downPaymentInput;

    @FindBy(xpath = "//*[@name='PrixPropriete']//../..//*[contains(@class,'min-slider-handle')]")
    private Element mortAmountAndPurchPriceSlider;

    @FindBy(xpath = "//*[@name='MiseDeFond']//../..//*[contains(@class,'min-slider-handle')]")
    private Element downPaymenSlider;

    @FindBy(xpath = "//*[@id='sliderPrixPropriete']")
    private Element mortAmountAndPurchPriceInnerInput;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private Element downPaymenInnerInput;

    @FindBy(xpath = "//*[@id='MiseDeFond_error']")
    private Element downPaymenError;

    @FindBy(xpath = "//*[contains(@for, 'Amortissement')]//..//*[@class='selectric']")
    private DropDown amortizationDropdown;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private Element sliderMiseDeFond;

    @FindBy(xpath = "//*[contains(@for, 'Amortissement')]//..//*[contains(@class,'selectric-wrapper')]")
    private Element paymentFrequencyDropdown;

    @FindBy(xpath = "//*[@id='TauxInteret']")
    private Input interestRateInput;

    @FindBy(xpath = " //*[@id='btn_calculer']")
    private Element calculateButton;


    @FindBy(xpath = "//*[@id='paiement-resultats']")
    private Element paymentResult;


//    private String dropDownValue = "./..//li[normalize-space()='%s']";


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
        Driver.actions().dragAndDropBy(mortAmountAndPurchPriceSlider, 100, 0).perform();
        return this;

    }

    public CalculatePaymentsPO moveDownPaymentSliderToDefaultValue() {
        info("Move Down Payment slider to default value");
        Driver.actions().dragAndDropBy(downPaymenSlider, 100, 0).perform();
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
//        amortizationDropdown.click();
//        amortizationDropdown.findElement(By.xpath(dropDownValue.replace("%s", amortizationValue))).click();
        return this;
    }

    public CalculatePaymentsPO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
//        info("Select payment frequency: " + paymentFrequency);
//        paymentFrequencyDropdown.click();
//        paymentFrequencyDropdown.findElement(By.xpath(dropDownValue.replace("%s", paymentFrequency))).click();
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
