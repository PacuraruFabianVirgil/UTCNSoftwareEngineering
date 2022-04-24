package pacuraru.fabian.lab6.ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Bank accounts = new Bank();
        accounts.AddAccount("Ionel", 890);
        accounts.AddAccount("George", 850);
        accounts.AddAccount("Maria", 980);
        accounts.AddAccount("Manuela", 880);
        accounts.AddAccount("Andrei", 790);
        accounts.printAccounts();
        accounts.printAccounts(800, 900);
        BankAccount me = new BankAccount("Ion",300);
        me = accounts.getAccount("George");
        me.withdraw(50);
        System.out.print(me.getOwner()+" "+me.getBalance()+"\n\n");
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list = accounts.getAllAccounts();
        for (int i=0; i<list.size()-1; i++) {
            int min_idx=i;
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(j).getOwner().compareTo(list.get(min_idx).getOwner())<0) {
                    min_idx=j;
                }
            }
            me=list.get(i);
            list.set(i, list.get(min_idx));
            list.set(min_idx, me);
        }
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i).getOwner()+" "+list.get(i).getBalance()+"\n");
        }
    }
}
