package atm.exceptions;

public class InsufficientBalance extends Exception {
    public InsufficientBalance() {
        super("There's no enough money in this account");
    }
}
