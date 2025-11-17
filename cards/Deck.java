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
            int random = (int)(Math.random() * 52);
            Card temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
        top = 0;
    }

    public void cut(int index) {
        if (index < 0) {
            index = 0;
        }
        if (index > 51) {
            index = 51;
        }
        Card[] temp = new Card[52];
        int pos = 0;
        for (int i = index; i < 52; i++ ) {
            temp[pos++] = cards[i];
        }
        for (int i = 0; i < index; i++) {
            temp[pos++] = cards[i];
        }
        cards = temp;
        top = 0;
    }

    public Card draw() {
        if (top >= 52) {
            return null;
        }
        return cards[top++];
    }

    public void print(int index) {
        if (index < 0) {
            index = 0;
        }
        if (index > 51) {
            index = 51;
        }
        for (int i = top; i <= index && i < 52; i++) {
            System.out.print(cards[i]);
            if (i < index && i < 51) {
                System.out.print(" ");
            } 
        }
        System.out.println();
    }


}
