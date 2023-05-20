package atm;

public class CardReader {
    private Card card;

    public void readCard(Card card) { // happens when the user enter their card
        this.card = card;
    }

    public Card getCurrentCard() { // returns to the current card (card in the card reader)
        return card;
    }
}
