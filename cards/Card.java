package cards;

public class Card {

    private int suit;
    private int value;

    public Card(int suit, int value) {

        if (suit < 0) {
            this.suit = 0;
        } else if (suit > 3) {
            this.suit = 3;
        } else {
            this.suit = suit;
        }

         if (value < 0) {
            this.value = 0;
        } else if (value > 12) {
            this.value = 12;
        } else {
            this.value = value;
        }

        
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        
    }


}
