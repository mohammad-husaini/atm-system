package atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.addClient(new BankAccount("acc", 1234));
    }
}
