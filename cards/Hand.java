package cards;

public class Hand {

    private Card[] cards;
    private int length;
    // Constructor takes max number of cards
    public Hand(int maxCards) {
        cards = new Card[maxCards];
        length = 0;
    }
    // Adds a card to the hand
    public void add(Card card) {
        if (length < cards.length) {
            cards[length++] = card;
        }
    }
    // returns number of cards in hand
    public int length() {
        return length;
    }
    // returns card at index without removing it
    public Card get(int index) {
        if (index >= 0 && index < length) {
            return cards[index];
        }
        return null;
    }
    // removes and returns card at index
    public Card remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Card removed = cards[index];
        // shift cards left to fill gap
        for (int i = index; i < length-1;i++) {
            cards[i] = cards[i+1];
        }
        length--;
        return removed;
    }
    // return the string of all cards
    public String toString() {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += cards[i];
            if (i < length-1) {
                result += " ";
            }
        }
        return result;
    }

    

}
