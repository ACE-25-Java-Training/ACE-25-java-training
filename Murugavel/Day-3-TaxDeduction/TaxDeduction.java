import java.util.Scanner;
import java.util.LinkedList;

/**
 * The TaxDeduction class provides methods to run a simple console based tax deduction application.
 * @author Murugavel
 */
public class TaxDeduction {
    private static double totalAmount = 0;
    private static double totalDeductionAmount = 0;
    private static LinkedList<AmountAndDeductionWrapper> transactionAmountList = new LinkedList<>();

    /// Calculates 8 percent of tax amount from the provided amount passed as an argument.
    /// @param amount
    /// @return double
    public static double calculateTaxDeduction(double amount){
        double taxAmount = amount * 0.08;
        return taxAmount;
    }

    /// Displays the details of a transaction that was made by an user.
    /// Outputs info such as the transaction amount, tax amount and updated maount into the console.
    /// @params transactionAmount, taxAmount, updatedAmount
    public static void displayTransactionDetails(double transactionAmount, double taxAmount, double updatedAmount){
        System.out.println("Transaction amount made: " + transactionAmount);
        System.out.println("Tax amount deduction: " + taxAmount);
        System.out.println("Total amount: " + updatedAmount);
    }

    /// Displays the total amount and deduction amounts into the console.
    public static void displayTotalAmounts(){
        System.out.println("\nTotal Amount: " + totalAmount);
        System.out.println("Total Deduction Made: " + totalDeductionAmount);
    }

    /// Gets the transaction amount entered by the user.
    /// Calculates the relevant tax amount with the help of calculateTaxDeduction() method.
    /// Displays the transaction details to the user.
    /// Asks for confirmation to add the transaction.
    /// Updates the values of total transaction and deduction after the confirmation of transaction and also adds the
    /// transaction to the records.
    /// @param sc
    public static void addTransactionWithTaxDeduction(Scanner sc){
        System.out.print("Enter the amount: ");
        double transactionAmount = sc.nextDouble();
        double taxAmount = calculateTaxDeduction(transactionAmount);
        double updatedAmount = transactionAmount + taxAmount; // calculating the total transaction amount

        System.out.println("\nTransaction Details");
        displayTransactionDetails(transactionAmount, taxAmount, updatedAmount);

        System.out.println("\nDo you wish to accept or discard the transaction?");
        System.out.println("1) Accept");
        System.out.println("2) Discard");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                transactionAmountList.offer(new AmountAndDeductionWrapper(transactionAmount, taxAmount));
                // updating the values of total transaction and deduction
                totalAmount += updatedAmount;
                totalDeductionAmount += taxAmount;
                System.out.println("Transaction successfully added!");
                break;

            case 2:
                System.out.println("Transaction has been discarded");
                break;

            default:
                System.out.println("Invalid choice, we are discarding this transaction");
        }

    }

    /// Displays all the records of transactions made by the user.
    /// Iterates over to output the details of the records into the console.
    public static void displayAllRecords(){
        if(transactionAmountList.size() == 0){ // no records are present
            System.out.println("No records to view");
            return;
        }

        int entryCounter = 1;
        for(AmountAndDeductionWrapper wrapper : transactionAmountList){
            double transactionAmount = wrapper.getTransactionAmount();
            double deductionAmount = wrapper.getDeductionAmount();
            System.out.println("\nEntry " + entryCounter++);
            displayTransactionDetails(transactionAmount, deductionAmount, transactionAmount + deductionAmount);
        }
    }

    /// Removes the last recent transaction made by the user.
    /// Doesn't perform the removal operation if no records are present.
    /// Displays the details of the removed transaction.
    /// Recalculates and updates the values of total transaction and deduction amount.
    public static void deleteRecentTransaction(){
        if(transactionAmountList.isEmpty()){ // no records are present
            System.out.println("Deletion can't be performed as there are no records present");
            return;
        }

        AmountAndDeductionWrapper wrapper = transactionAmountList.pollLast();
        double transactionAmount = wrapper.getTransactionAmount();
        double deductionAmount = wrapper.getDeductionAmount();
        double transactionAmountMade = transactionAmount + deductionAmount; // the total transaction amount made by the user

        System.out.println("\nThe recently made transaction has been removed. Transaction Details");
        displayTransactionDetails(transactionAmount, deductionAmount, transactionAmountMade);

        // updating the values of total transaction and dedection
        totalAmount -= transactionAmountMade;
        totalDeductionAmount -= deductionAmount;
    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Welcome to the Tax Deduction Application");
            System.out.println("1) Add a Transaction.");
            System.out.println("2) Display all records.");
            System.out.println("3) Delete the most recent Transaction.");
            System.out.println("4) Exit.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTransactionWithTaxDeduction(sc);
                    displayTotalAmounts();
                    break;

                case 2:
                    displayAllRecords();
                    break;

                case 3:
                    deleteRecentTransaction();
                    displayTotalAmounts();
                    break;

                case 4:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice. Try again");
            }
            System.out.println();
        }while(flag);
        sc.close();
    }
}
