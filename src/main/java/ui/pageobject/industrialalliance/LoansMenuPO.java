package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoansMenuPO  extends ReqResBasePO{

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]//*[@data-utag-name='mortgage_loan']")
    private WebElement mortgageLoan;

    @FindBy(xpath = "//*[@data-utag-name='rrsp_loan']")
    private WebElement rrspLoan;

    @FindBy(xpath = "//*[@data-utag-name='resp_loan']")
    private WebElement respLoan;

    @FindBy(xpath = "//*[@data-utag-name='investment_loans']")
    private WebElement investmentLoans;

    public Mortgages clickMortgagesLoan() {
        info("Go to Mortgages");
        mortgageLoan.click();
        return new Mortgages();
    }
}
