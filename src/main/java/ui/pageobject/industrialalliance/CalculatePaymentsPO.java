package ui.pageobject.industrialalliance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.driver.Driver;

public class CalculatePaymentsPO  extends Mortrages{
    @FindBy(xpath = "//input[@id='par_valeur']")
    private WebElement purchasePriceRadioValue;

    @FindBy(xpath = "//input[@id='par_pret']")
    private WebElement mortgageAmountRadioValue;

    @FindBy(xpath = "//input[@id='PrixPropriete']")
    private WebElement mortAmountAndPurchePriceInput;

    @FindBy(xpath = "//input[@id='MiseDeFond']")
    private WebElement downPaymentInput;

    @FindBy(xpath = "//*[@name='PrixPropriete']//../..//*[contains(@class,'min-slider-handle')]")
    private WebElement mortAmountAndPurchPriceSlider;

    @FindBy(xpath = "//*[@name='MiseDeFond']//../..//*[contains(@class,'min-slider-handle')]")
    private WebElement downPaymenSlider;

    @FindBy(xpath = "//*[@id='sliderPrixPropriete']")
    private WebElement mortAmountAndPurchPriceInnerInput;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private WebElement downPaymenInnerInput;

    @FindBy(xpath = "//*[contains(@for, 'Amortissement')]//..//*[@class='selectric']")
    private WebElement amortizationDropdown;

    @FindBy(xpath = "//*[@id='sliderMiseDeFond']")
    private WebElement sliderMiseDeFond;

    @FindBy(xpath = "//*[contains(@for, 'FrequenceVersement')]//following-sibling::*//*[@class='selectric']")
    private WebElement paymentFrequencyDropdown;

    @FindBy(xpath = "//*[@id='TauxInteret']")
    private WebElement interestRateInput;

    private String dropDownValue = "./..//li[normalize-space()='%s']";


    public CalculatePaymentsPO clickPurchasePriceRadioValue() {
        purchasePriceRadioValue.click();
        return this;
    }

    public CalculatePaymentsPO clickMortgageAmountRadioValue() {
        mortgageAmountRadioValue.click();
        return this;
    }

    public CalculatePaymentsPO clearMortAmountAndPurchePriceInput() {
        mortAmountAndPurchePriceInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeIntoMortAmountAndPurchePriceInput(CharSequence... mortgageAmount) {
        mortAmountAndPurchePriceInput.sendKeys(mortgageAmount);
        return this;
    }

    public CalculatePaymentsPO moveMortAmountAndPurcePriceSliderToDefaultValue() {
        Driver.actions().dragAndDropBy(mortAmountAndPurchPriceSlider, 100, 0).perform();
        return this;

    }

    public CalculatePaymentsPO moveDownPaymenSliderToDefaultValue() {
        Driver.actions().dragAndDropBy(downPaymenSlider, 100, 0).perform();
        return this;

    }

    public String getMortAmountAndPurchePriceValue() {
        return mortAmountAndPurchPriceInnerInput.getAttribute("value");
    }

    public String getdownPaymenInnerValue() {
        return downPaymenInnerInput.getAttribute("value");
    }

    public CalculatePaymentsPO clearDownPaymentInput() {
        downPaymentInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeIntoDownPaymentInput(String downPayment) {
        downPaymentInput.sendKeys(downPayment);
        return this;
    }

    public CalculatePaymentsPO selectAmortizationByVisibleText(String amortizationValue) {
        amortizationDropdown.click();
        amortizationDropdown.findElement(By.xpath(dropDownValue.replace("%s", amortizationValue))).click();
        return this;
    }

    public CalculatePaymentsPO selectPaymentFrequencyByVisibleText(String paymentFrequency) {
        paymentFrequencyDropdown.click();
        paymentFrequencyDropdown.findElement(By.xpath(dropDownValue.replace("%s", paymentFrequency))).click();
        return this;
    }

    public CalculatePaymentsPO clearInterestRateInput() {
        interestRateInput.clear();
        return this;
    }

    public CalculatePaymentsPO typeIntoInterestRateInput(String interestRate) {
        interestRateInput.sendKeys(interestRate);
        return this;
    }


}
