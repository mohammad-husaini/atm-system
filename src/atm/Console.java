package atm;

import atm.exceptions.Cancelled;
import java.util.Scanner;

public class Console {
    Scanner input;
    public Console() {
        Scanner sc = new Scanner(System.in);
    }
    public static String[] MAINMENU = {
            "Widthraw",
            "Balance Inquery",
            "Cancel"
    };
    public static String[] WITHDRAWMENU = {
            "SELECT amount",
            "1: 20",
            "2: 40",
            "3: 60",
            "4: 100",
            "5: 200",
            "6: Enter amount",
            "-1: Cancel"
    };
    public int readPIN(String prompt) throws Cancelled {
        try{
            this.input = new Scanner(System.in);
            int PIN = this.input.nextInt();
            return PIN;
        } catch(Exception ex){
            throw new Cancelled();
        }
    }
    public int readMenuChoice(String prompt, String[] menu) throws Cancelled{
        int choice = input.nextInt();
        if (choice == -1) {
            throw new Cancelled();
        }
        return choice;
    }

    public int readAmount(String prompt) throws Cancelled {
        int amount = input.nextInt();
        if (amount == -1) {
            throw new Cancelled();
        }
        return amount;
    }
}