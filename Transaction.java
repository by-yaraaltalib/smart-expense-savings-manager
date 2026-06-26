package smartexpensesavingsmanager;

public class Transaction {
    private String name;
    private double amount;
    private String category;
    private String date;
    private String type;

    public Transaction(String name, double amount, String category, String date, String type) {
        this.name = name;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public void displayTransaction() {
        System.out.println(type + " | " + name + " | " + amount + " SAR | " + category + " | " + date);
    }
}