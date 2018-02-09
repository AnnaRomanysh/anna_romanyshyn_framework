package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortrages  extends LoansPO{

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_payments']")
    private WebElement calculatePaymentButton;

    public CalculatePaymentsPO clickCalculatePayment() {
        calculatePaymentButton.click();
        return new CalculatePaymentsPO();
    }
}
