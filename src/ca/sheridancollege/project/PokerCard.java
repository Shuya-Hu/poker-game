/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
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
    String value;
    switch (this.value) {
        case 11:
            value = "J";
            break;
        case 12:
            value = "Q";
            break;
        case 13:
            value = "K";
            break;
        case 14:
            value = "A";
            break;
        default:
            value = String.valueOf(this.value);
    }
    return this.suit + value;
    }
}
