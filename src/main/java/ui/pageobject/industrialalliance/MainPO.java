package ui.pageobject.industrialalliance;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.pageobject.BasePO;

public class MainPO extends BasePO {

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]")
    private WebElement loans;

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]//*[@data-utag-name='mortgage_loan']")
    private WebElement mortgage;

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_payments']")
    private WebElement calculatePaymentButton;

    @FindBy(xpath = "//input[@id='par_valeur']")
    private WebElement   purchasePriceRadioValue;

    @FindBy(xpath = "//input[@id='par_pret']")
    private WebElement   mortgageAmountRadioValue;

    @FindBy(xpath = "//input[@id='PrixPropriete']")
    private WebElement   mortgageAmountInput;

    @FindBy(xpath = "//input[@id='MiseDeFond']")
    private WebElement   downPaymentInput;


    public MainPO clickLoans (){
        loans.click();
        return this;
    }
    public MainPO clickMortgage (){
        mortgage.click();
        return this;
    }
    public MainPO clickCalculatePayment(){
        calculatePaymentButton.click();
        return this;
    }
    public MainPO clickPurchasePriceRadioValue(){
        purchasePriceRadioValue.click();
        return this;
    }
    public MainPO clickMortgageAmountRadioValue(){
        mortgageAmountRadioValue.click();
        return this;
    }

    public MainPO typeIntoMortgageAmountInput(String mortgageAmount){
        mortgageAmountInput.clear();
        mortgageAmountInput.sendKeys(mortgageAmount);
        mortgageAmountInput.sendKeys(Keys.ENTER);
        return this;
    }
    public MainPO typeIntoDownPaymentInput(String downPayment){
        downPaymentInput.clear();
        downPaymentInput.sendKeys(downPayment);
        downPaymentInput.sendKeys(Keys.ENTER);
        return this;
    }



}
