package atm;

import atm.exceptions.InsufficientBalance;

public class BankAccount {
    private String clientName;
    private double balance;
    private Card card;

    public BankAccount(String clientName, int PIN) {
        this.clientName = clientName;
        balance = 0;
        this.card = new Card(PIN);
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public double getBalance() {
        return balance;
    }

    public Card getCard() {
        return card;
    }

    public void withdraw(int amount) throws Exception {
        if (balance - amount >= 0) {
            balance -= amount;
        } else throw new InsufficientBalance();
    }
}
