package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.element.Element;

public class LoansMenuPO  extends ReqResBasePO{

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]//*[@data-utag-name='mortgage_loan']")
    private Element mortgageLoan;

    @FindBy(xpath = "//*[@data-utag-name='rrsp_loan']")
    private Element rrspLoan;

    @FindBy(xpath = "//*[@data-utag-name='resp_loan']")
    private Element respLoan;

    @FindBy(xpath = "//*[@data-utag-name='investment_loans']")
    private Element investmentLoans;

    public Mortgages clickMortgagesLoan() {
        info("Go to Mortgages");
        mortgageLoan.click();
        return new Mortgages();
    }
}
