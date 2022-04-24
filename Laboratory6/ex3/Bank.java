package pacuraru.fabian.lab6.ex3;

import java.util.*;

public class Bank {
    Set<BankAccount> sortedByNameAccounts = new TreeSet<>(new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            return (-1)*(o2.getOwner().compareTo(o1.getOwner()));
        }
    });
    Set<BankAccount> sortedByBalanceAccounts = new TreeSet<>(new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            if (o1.getBalance()>o2.getBalance())
                return 1;
            else if (o1.getBalance()<o2.getBalance())
                return -1;
            else return 0;
        }
    });
    public void AddAccount(String owner, double balance) {
        sortedByNameAccounts.add(new BankAccount(owner, balance));
        sortedByBalanceAccounts.add(new BankAccount(owner, balance));
    }
    public void printAccounts() {
        for(BankAccount allAccounts : sortedByBalanceAccounts){
            System.out.println(allAccounts.getOwner() + " " + allAccounts.getBalance());
        }
        System.out.println("\n");
    }
    public void printAccounts(double minBalance, double maxBalance) {
        for(BankAccount allAccounts : sortedByNameAccounts){
            if ((allAccounts.getBalance()>minBalance)&&(allAccounts.getBalance()<maxBalance))
                System.out.println(allAccounts.getOwner() + " " + allAccounts.getBalance());
        }
        System.out.println("\n");
    }
    public BankAccount getAccount(String owner) {
        BankAccount aux = new BankAccount("",0);
        for(BankAccount allAccounts : sortedByNameAccounts){
            if(allAccounts.getOwner()==owner)
                aux=allAccounts;
        }
        return aux;
    }
    public Set<BankAccount> getAllAccounts() {
        return sortedByNameAccounts;
    }
}
