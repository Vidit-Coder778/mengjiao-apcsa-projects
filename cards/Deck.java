package cards;

public class Deck {
    private Card[] cards;
    private int top;

    public Deck() {
        cards = new Card[52];
        top = 0;
        int index = 0;
        for (int suit = 0;suit < 4; suit++) {
            for (int value = 0; value < 13; value++) {
                cards[index] = new Card(suit,value);
                index++;

            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < 52;i++) {
            int random = (int)(Math.random * 52);
            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
        top = 0;
    }


}
