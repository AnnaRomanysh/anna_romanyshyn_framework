package ui.pageobject.industrialalliance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mortgages  extends ReqResBasePO{

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_payments']")
    private WebElement calculatePaymentButton;

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_capacity']")
    private WebElement calculateCapacityButton;

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='apply_pre_approval']")
    private WebElement applyPreApprovalButton;

    public CalculatePaymentsPO clickCalculatePayment() {
        info("Go to Calculate Payment page");
        calculatePaymentButton.click();
        return new CalculatePaymentsPO();
    }
}
