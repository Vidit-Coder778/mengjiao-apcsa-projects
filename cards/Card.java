package cards;

public class Card {
    // Instance variables
    private int suit;
    private int value;
    // list of arrays
    private static String[] SUITS = {"♦", "♣", "♥", "♠"};
    private static String[] VALUES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    // constructor
    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    // returns string 
    public String toString() {
        return "" + SUITS[suit] + VALUES[value];
    }

}



