package pacuraru.fabian.lab6.ex1;

public class Test {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Dorel",1350);
        BankAccount bank2 = new BankAccount("Marcel",1500);
        System.out.print(bank1.hashCode() + "\n");
        System.out.print(bank1.hashCode() + "\n");
        System.out.print(bank2.hashCode() + "\n");
        System.out.print(bank1.equals(bank2) + "\n");
        bank2.withdraw(150);
        System.out.print(bank1.equals(bank2) + "\n");
    }
}
