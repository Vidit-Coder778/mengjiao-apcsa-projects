package cards;

public class Card {
    // Instance variables
    private int suit;
    private int value;

    public Card(int suit, int value) {
        // Limits the suit's range
        if (suit < 0) {
            this.suit = 0;
        } else if (suit > 3) {
            this.suit = 3;
        } else {
            this.suit = suit;
        }
        // Limits value's range
         if (value < 0) {
            this.value = 0;
        } else if (value > 12) {
            this.value = 12;
        } else {
            this.value = value;
        }

        
    }
    // returns current value of the card
    public int getValue() {
        return value;
    }
    // retuns string with suit symbol and value character
    public String toString() {

        // Get suit symbol
        String suitSymbol = "";
            if (suit == 0) {
                suitSymbol = "♦";
            }
            else if (suit == 1) {
                suitSymbol = "♣"; 
            } 
            else if (suit == 2) {
                suitSymbol = "♥";
            }
            else {
                suitSymbol = "♠";
            }
        // Get value character
        String valueChar = "";
        if (value == 0) {
            valueChar = "A";
        }
        else if (value >= 1 && value <= 9) {
            valueChar = String.valueOf(value+1);
        }
        else if (value == 10) {
            valueChar = "J";
        }
        else if (value == 11) {
            valueChar = "Q";
        }
        else {
            valueChar = "K";
        }

        return suitSymbol + valueChar;
    }


}
