package atm.exceptions;

public class InvalidPIN extends Exception {
    public InvalidPIN() {
        super("The pin you entered is invalid");
    }
}
