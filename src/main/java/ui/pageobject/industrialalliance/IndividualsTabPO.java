package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualsTabPO extends ReqResBasePO {

    @FindBy(xpath = "//*[@data-utag-name='insurance']")
    private WebElement insurance;

    @FindBy(xpath = " //*[@data-utag-name='saving_and_retirement']")
    private WebElement savingAndRetirement;

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]")
    private WebElement loans;

    public LoansMenuPO clickLoans() {
        info("Open Loans Menu");
        loans.click();
        return new LoansMenuPO();
    }

}
