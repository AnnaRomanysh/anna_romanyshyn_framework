package ui.pageobject.industrialalliance;
import org.openqa.selenium.support.FindBy;
import ui.element.Button;


public class IndividualsTabPO extends ReqResBasePO {

    @FindBy(xpath = "//*[@data-utag-name='insurance']")
    private Button insurance;

    @FindBy(xpath = " //*[@data-utag-name='saving_and_retirement']")
    private Button savingAndRetirement;

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]")
    private Button loans;

    public LoansMenuPO clickLoans() {
        info("Open Loans Menu");
        loans.click();
        return new LoansMenuPO();
    }


}
