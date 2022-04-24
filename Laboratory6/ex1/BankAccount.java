package pacuraru.fabian.lab6.ex1;

public class BankAccount {
    private String owner;
    private double balance;
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean equals(BankAccount other) {
        if (this.balance==other.balance)
            return true;
        else return false;
    }
    public int hashCode() {
        return owner.hashCode() * (int)balance;
    }
}
