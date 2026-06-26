package smartexpensesavingsmanager;

import java.util.Scanner;

public class SmartExpenseSavingsManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        int choice;

        do {
            System.out.println("\n < Smart Expense & Savings Manager > ");
            System.out.println("1. Add income");
            System.out.println("2. Add expense");
            System.out.println("3. View balance");
            System.out.println("4. View all transactions");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addTransaction(input, manager, "INCOME");
                    break;

                case 2:
                    addTransaction(input, manager, "EXPENSE");
                    break;

                case 3:
                    System.out.println("Current balance: " + manager.calculateBalance() + " SAR");
                    break;

                case 4:
                    manager.displayAllTransactions();
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);

        input.close();
    }

    public static void addTransaction(Scanner input, FinanceManager manager, String type) {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.print("Enter date, example 2026-06-26: ");
        String date = input.nextLine();

        Transaction transaction = new Transaction(name, amount, category, date, type);
        manager.addTransaction(transaction);

        System.out.println(type + " added successfully.");
    }
}