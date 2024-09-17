package encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount1 myAccount = new BankAccount1("123456", 1000);
        
        System.out.println("Initial balance: $" + myAccount.getBalance());
        
        myAccount.deposit(500);
        System.out.println("After deposit: $" + myAccount.getBalance());
        
        myAccount.withdraw(200);
        System.out.println("After withdrawal: $" + myAccount.getBalance());
        
        myAccount.withdraw(2000);  // This should fail
        
        System.out.println("Final balance: $" + myAccount.getBalance());
        System.out.println("Account number: " + myAccount.getAccountNumber());
    }
}
 class BankAccount1 {
    private double balance;
    private String accountNumber;

    public BankAccount1(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
