/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 */

package ca.sheridancollege.project;

public class PokerCard extends Card {
    // PokerCard is a subclass of Card and it has its own unique data fields:
    private int value;
    private String suit;

    public PokerCard(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    // print the current pocker card, including the number and the pattern on it.
    @Override
    public String toString() {
        /**
         * todo: implement more specific to String method.
         * todo goal: Find a more readable and consistant way to display pocker card.
         */

        return value + "-" + suit;
    }
}
