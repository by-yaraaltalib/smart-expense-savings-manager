package smartexpensesavingsmanager;

import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Transaction> transactions;

    public FinanceManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculateBalance() {
        double balance = 0;

        for (Transaction transaction : transactions) {
            if (transaction.getType().equalsIgnoreCase("INCOME")) {
                balance += transaction.getAmount();
            } else if (transaction.getType().equalsIgnoreCase("EXPENSE")) {
                balance -= transaction.getAmount();
            }
        }

        return balance;
    }

    public void displayAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}