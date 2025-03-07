import java.util.ArrayList;
import java.util.List;

/**
 * A project to deposit amount that deduces the tax of 8% and stores the txn log
 * At the end, display the total amount deposited and tax be paid
 *
 * @author thangaakilanv
 */
public class SmartBanking {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(10000);
        account.withdraw(5000);
        account.display();

    }
}


/**
 * A class for bank account with balance, taxDeduction and transaction logs
 * It can be sed to deposit and withdraw amount
 *
 * @author thangaakilanv
 */
class BankAccount{
    private double balance;
    private double taxDeduction;
    private List<String> transactionLog = new ArrayList<>();

    BankAccount(int initialDeposit){
        taxDeduction += initialDeposit * 0.08;
        balance += initialDeposit * 0.98;
        transactionLog.add("Deposited Amount Rs."+ initialDeposit +"   Tax Deduced Rs."+taxDeduction+ "   Net Balance Rs."+  balance);

    }


    /**
     * A method to deposit amount to the bank account after deduction of tax
     * transaction log is stored
     *
     * @param depositAmount
     */
    public void deposit(int depositAmount){
        taxDeduction += depositAmount * 0.08;
        balance += depositAmount * 0.98;
        transactionLog.add("Deposited Amount Rs."+ depositAmount +"   Tax Deduced Rs."+taxDeduction+ "   Net Balance Rs."+  balance);
    }


    /**
     * A method to withdraw amount from an accout=nt after reduction of nrcessary tax
     *
     * @param withdrawAmount
     */
    public void withdraw(int withdrawAmount){
        if(withdrawAmount < 0 || withdrawAmount > balance){
            taxDeduction += withdrawAmount * 0.08;
            balance -= withdrawAmount * 0.98;
            transactionLog.add("Deposited Amount Rs."+ withdrawAmount +"   Tax Deduced Rs."+taxDeduction+ "   Net Balance Rs."+  balance);


        }
    }


    /**
     * Display the transaction along with the balances and total tax paid.
     *
     * @author thangaakilanv
     */
    public void display(){
        for (String transaction: transactionLog){
            System.out.println(transaction);
        }
        System.out.println("Total Deposit : "+balance);
        System.out.println("Total taxes : "+taxDeduction);
    }
}
