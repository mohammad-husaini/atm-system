package atm;

import atm.exceptions.NotEnoughCash;

public class CashDispenser {

    private int cash;

    public CashDispenser(int cash) {
        this.cash = cash;
    }

    public void dispenseCash(int amount) throws Exception {
        if (cash - amount >= 0) {
            cash -= amount;
        } else throw new NotEnoughCash();
    }

    public boolean isReady() {
        return true; // waits for the user to collect money and exit
    }
}