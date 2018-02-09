package ui.pageobject.industrialalliance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.driver.Driver;
import ui.pageobject.BasePO;


public class MainPO extends BasePO {

    @FindBy(xpath = "//*[@id='iconHomeNav']")
    private WebElement homeIcon;

    @FindBy(xpath = "//*[@id='topLangMenuItem']")
    private WebElement languageItem;

    @FindBy(xpath = "//*[contains(@class,'dropdown connexion')]")
    private WebElement connecDropdown;

    @FindBy(xpath = "//*[@data-utag-name='individuals']")
    private WebElement individualsTab;

    @FindBy(xpath = "//*[@data-utag-name='companies_and_groups']")
    private WebElement companiesAndGroupsTab;

    @FindBy(xpath = "//*[@data-utag-name='advisors_and_brokers']")
    private WebElement advisorsAndBrokersTab;



    public MainPO clickHomeIcon(){
        homeIcon.click();
        return this;
    }
    public MainPO clickLanguageIcon(){
        languageItem.click();
        return this;
    }
    public MainPO clickConnecDropdown(){
        connecDropdown.click();
        return this;
    }
    public IndividualsTabPO openIndividualsTab(){
        individualsTab.click();
        return new IndividualsTabPO();
    }



}
