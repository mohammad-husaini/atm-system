package atm.exceptions;

public class NotEnoughCash extends Exception {
    public NotEnoughCash() {
        super("There's no enough cash in the money dispenser");
    }
}
