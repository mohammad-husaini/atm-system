package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<BankAccount> clients;
    ATM atm;

    public Bank() {
        clients = new ArrayList<>();
        atm = new ATM();
    }

    public void addClient(BankAccount client) {
        clients.add(client);
    }

    public ArrayList<BankAccount> getClients() {
        return clients;
    }
}
