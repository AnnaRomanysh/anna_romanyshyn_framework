package ui.pageobject.industrialalliance;
import org.openqa.selenium.support.FindBy;
import ui.element.Link;

public class LoansMenuPO  extends ReqResBasePO{

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]//*[@data-utag-name='mortgage_loan']")
    private Link mortgageLoan;

    @FindBy(xpath = "//*[@data-utag-name='rrsp_loan']")
    private Link rrspLoan;

    @FindBy(xpath = "//*[@data-utag-name='resp_loan']")
    private Link respLoan;

    @FindBy(xpath = "//*[@data-utag-name='investment_loans']")
    private Link investmentLoans;

    public Mortgages clickMortgagesLoan() {
        info("Go to Mortgages");
        mortgageLoan.click();
        return new Mortgages();
    }
}
