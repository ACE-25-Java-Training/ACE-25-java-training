/**
 * Wrapper class to hold the transaction amount and deduction amount.
 * @author Murugavel
 */
public class AmountAndDeductionWrapper {
    private double transactionAmount;
    private double deductionAmount;

    public AmountAndDeductionWrapper(double transactionAmount, double deductionAmount){
        this.transactionAmount = transactionAmount;
        this.deductionAmount = deductionAmount;
    }

    public double getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
