package models.ui;

public class MortgagePaymentModel {

    private int purchasePrice;

    private int downPayment;

    private String amortization;

    private String paymentFrequency;

    private int interestRate;

    public MortgagePaymentModel(int purchasePrice, String amortization, String paymentFrequency, int interestRate) {
        this.purchasePrice = purchasePrice;
        this.amortization = amortization;
        this.paymentFrequency = paymentFrequency;
        this.interestRate = interestRate;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(int downPayment) {
        this.downPayment = downPayment;
    }

    public String getAmortization() {
        return amortization;
    }

    public void setAmortization(String amortization) {
        this.amortization = amortization;
    }

    public String getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
}
