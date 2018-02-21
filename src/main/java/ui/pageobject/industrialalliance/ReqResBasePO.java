package ui.pageobject.industrialalliance;
import org.openqa.selenium.support.FindBy;
import ui.element.Button;
import ui.element.Checkbox;
import ui.element.TextArea;
import ui.pageobject.BasePO;


public class ReqResBasePO extends BasePO {

    @FindBy(xpath = "//*[@id='iconHomeNav']")
    private Button homeIcon;

    @FindBy(xpath = "//*[@id='topLangMenuItem']")
    private Button languageItem;

    @FindBy(xpath = "//*[contains(@class,'dropdown connexion')]")
    private Button connectMenu;

    @FindBy(xpath = "//*[@data-utag-name='individuals']")
    private Button individualsTab;

    @FindBy(xpath = "//*[@data-utag-name='companies_and_groups']")
    private Button companiesAndGroupsTab;

    @FindBy(xpath = "//*[@data-utag-name='advisors_and_brokers']")
    private Button advisorsAndBrokersTab;

    public ReqResBasePO clickHomeIcon() {
        info("Click on Home icon");
        homeIcon.click();
        return this;
    }

    public ReqResBasePO clickLanguageIcon() {
        info("Change language");
        languageItem.click();
        return this;
    }

    public ReqResBasePO clickConnectDropdown() {
        info("Open Connect dropdown");
        connectMenu.click();
        return this;
    }

    public IndividualsTabPO openIndividualsTab() {
        info("Open Individuals Tab");
            individualsTab.click();
        return new IndividualsTabPO();
    }



    @FindBy(xpath = "//*[@heading='Boolean checkboxes demo' ]")
    private Checkbox f;


    //    mob
    @FindBy(xpath = "//*[@id='toggle-menu']")
    private TextArea menu;

    public IndividualsTabPO clickMenu(){
        menu.click();
        return new IndividualsTabPO();
    }



//


}
