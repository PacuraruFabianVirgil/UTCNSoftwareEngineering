package pacuraru.fabian.lab6.ex3;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.AddAccount("Andrei", 860);
        bank.AddAccount("Ion", 790);
        bank.AddAccount("Marian", 920);
        bank.AddAccount("Ioana", 870);
        bank.AddAccount("Maria", 950);
        bank.AddAccount("Ana", 890);
        bank.printAccounts();
        bank.printAccounts(800, 900);
        BankAccount Ioana = bank.getAccount("Ioana");
        System.out.print(Ioana.getOwner()+" "+Ioana.getBalance()+"\n");
    }
}
