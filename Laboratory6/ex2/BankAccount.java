package pacuraru.fabian.lab6.ex2;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance) {
        this.owner=owner;
        this.balance=balance;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }
}
