package edu.utcn.lab12.bankaccount;

import java.util.ArrayList;

public class AccountsManager {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public boolean exists(String id){
        int count = 0;
        for(int i=0; i<accounts.size(); i++){
            if(accounts.get(i).getId().equals(id)){
                count++;
            }
        }
        if(count==0){
            return false;
        } else return true;
    }

    public int count(){
        return accounts.size();
    }
}
