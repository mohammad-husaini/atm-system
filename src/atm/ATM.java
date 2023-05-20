package atm;

public class ATM {
    private CardReader cardReader;
    private CashDispenser cashDispenser;
    private Console console;

    public ATM(){
        this.cardReader = new CardReader();
        this.cashDispenser = new CashDispenser(1000);
        this.console = new Console();
    }
}