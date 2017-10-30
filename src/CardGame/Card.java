/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 * A class to represent a single playing card
 *
 * @author slatz8075
 */
public class Card {

    //suit constants
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int SPADES = 2;
    public static final int HEARTS = 3;
    //instance variables
    private int rank;
    private int suit;

    //constructor
    /**
     * This is the constructor for a single playing card
     *
     * @param rank the rank of the card (1 - 13)
     * @param suit the suit of the card
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * get the suit of the card
     *
     * @return the suit of the card
     */
    public int getSuit() {
        return this.rank;
    }

    /**
     * gets the rank of the card
     *
     * @return the rank of the card
     */
    public int getRank() {
        return this.suit;
    }

    /**
     * Determines if this card is bigger than another card
     *
     * @param c the card to check against
     * @return true if the card is bigger than card
     */
    public boolean isBigger(Card c) {
        //is this card bigger than the one passed in
        if (this.rank > c.rank) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Pretty version of a card
     *
     * @return
     */
    public String toString() {
        String output = "";
        if (this.rank == 1) {
            output += "Ace";
        } else if (this.rank <= 10) {
            output += this.rank;
        } else if (this.rank == 11) {
            output += "Jack";
        } else if (this.rank == 12) {
            output += "Queen";
        } else if (this.rank == 13) {
            output += "King";
        }
        
        output += " of ";
        
        if(this.suit == CLUBS){
            output += "\u2663";
        }else if(this.suit == DIAMONDS){
            output += "\u2662";
        }else if(this.suit == SPADES){
            output += "\u2660";
        }else{
            output += "\u2661";
        }
        return output;
    }
}
        
