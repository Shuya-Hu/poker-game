/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
 */

package ca.sheridancollege.project;

public class PokerCard extends Card {
    // PokerCard is a subclass of Card and it has its own unique data fields:
    private int value;
    private String suit;

    /**
     *
     * @param value The value of one poker card
     * @param suit  The pattern on one poker card
     */
    public PokerCard(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     *
     * @return the poker card's value
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @return the poker card's pattern
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return return the string which includes the value and the pattern of one
     *         poker card.
     */
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
