package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.element.Element;

public class IndividualsTabPO extends ReqResBasePO {

    @FindBy(xpath = "//*[@data-utag-name='insurance']")
    private Element insurance;


    @FindBy(xpath = " //*[@data-utag-name='saving_and_retirement']")
    private Element savingAndRetirement;

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]")
    private Element loans;

    public LoansMenuPO clickLoans() {
        info("Open Loans Menu");
        loans.click();
        return new LoansMenuPO();
    }

}
