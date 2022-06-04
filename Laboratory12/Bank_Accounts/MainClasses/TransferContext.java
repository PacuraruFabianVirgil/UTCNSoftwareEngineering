package edu.utcn.lab12.bankaccount;

public class TransferContext {

    public void transfer(BankAccount sender, BankAccount receiver, int ammount){
        sender.decrease(ammount);
        receiver.increase(ammount);
    }

}
