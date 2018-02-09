package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoansPO  extends IndividualsTabPO{

    @FindBy(xpath = "//*[contains(@class, 'dropdown Pret')]//*[@data-utag-name='mortgage_loan']")
    private WebElement mortgages;

    public Mortrages clickMortgage() {
        mortgages.click();
        return new Mortrages();
    }
}
