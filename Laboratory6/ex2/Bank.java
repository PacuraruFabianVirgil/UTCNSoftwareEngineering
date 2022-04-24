package pacuraru.fabian.lab6.ex2;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    public void AddAccount(String owner, double balance) {
        BankAccount aux = new BankAccount(owner, balance);
        accounts.add(aux);
    }
    public void printAccounts() {
        ArrayList<BankAccount> accounts2 = accounts;
        BankAccount aux;
        for (int i=0; i<accounts2.size()-1; i++) {
            int min_idx=i;
            for (int j=i+1; j<accounts2.size(); j++) {
                if (accounts2.get(j).getBalance() < accounts2.get(min_idx).getBalance()) {
                    min_idx=j;
                }
            }
            aux=accounts2.get(i);
            accounts2.set(i, accounts2.get(min_idx));
            accounts2.set(min_idx, aux);
        }
        for (int i=0; i<accounts2.size(); i++) {
            System.out.print(accounts2.get(i).getOwner()+" "+accounts2.get(i).getBalance()+"\n");
        }
        System.out.print("\n");
    }
    public void printAccounts(double minBalance, double maxBalance) {
        for (int i=0; i<accounts.size(); i++) {
            if ((accounts.get(i).getBalance()>minBalance) && (accounts.get(i).getBalance()<maxBalance))
                System.out.print(accounts.get(i).getOwner()+" "+accounts.get(i).getBalance()+"\n");
        }
        System.out.print("\n");
    }
    public BankAccount getAccount(String owner) {
        int nr = accounts.size();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getOwner() == owner) {
                nr = i;
            }
        }
        return accounts.get(nr);
    }
    public ArrayList<BankAccount> getAllAccounts() {
        return accounts;
    }
}
