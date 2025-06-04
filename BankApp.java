class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void showBalance() {
        System.out.println(name + "'s balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.showBalance();
    }
}




