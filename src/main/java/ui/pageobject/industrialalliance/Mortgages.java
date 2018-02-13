package ui.pageobject.industrialalliance;
import org.openqa.selenium.support.FindBy;
import ui.element.Element;

public class Mortgages  extends ReqResBasePO{

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_payments']")
    private Element calculatePaymentButton;

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='calculate_your_capacity']")
    private Element calculateCapacityButton;

    @FindBy(xpath = "//*[contains(@class, 'section-entete')]//..//*[@data-utag-name='apply_pre_approval']")
    private Element applyPreApprovalButton;

    public CalculatePaymentsPO clickCalculatePayment() {
        info("Go to Calculate Payment page");
        calculatePaymentButton.click();
        return new CalculatePaymentsPO();
    }
}
