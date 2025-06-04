class BankAccount {
    private double balance;
    private String name;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(name + ": Withdrew Rs." + amount);
    }

    public void deposit(double amount) {
        // Simulatating failure condition
        throw new RuntimeException("Bank server error during deposit!");
        // balance += amount;
        // System.out.println(name + ": Deposited Rs." + amount);
    }

     public void refund(double amount) {
        balance += amount;
        System.out.println(name + ": Refunded Rs." + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}

public class BankTransferDemoWithExceptionHandling {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("Account A", 10000);
        BankAccount accountB = new BankAccount("Account B", 5000);

        System.out.println("Before Transfer:");
        printBalances(accountA, accountB);

        transferMoney(accountA, accountB, 2000);  // transfer ₹2000

        System.out.println("After Transfer:");
        printBalances(accountA, accountB);
    }

    public static void transferMoney(BankAccount from, BankAccount to, double amount) 
    {
        try 
        {
            from.withdraw(amount); // Step 1: Deduct money from A
            to.deposit(amount);    // Step 2: Deposit to B (fails here)
         } 
        catch (Exception e) 
        {  
            System.out.println("Error: " + e.getMessage());
            from.refund(amount);  // Refund if failure occurs
            System.out.println("Transaction rolled back.");
        }
    }
    public static void printBalances(BankAccount a1, BankAccount a2) 
    {
        System.out.println(a1.getName() + " Balance: Rs." + a1.getBalance());
        System.out.println(a2.getName() + " Balance: Rs." + a2.getBalance());
    }
}


