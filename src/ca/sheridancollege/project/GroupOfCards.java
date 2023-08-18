package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for
 * reuse.
 *
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
 */
public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private ArrayList<PokerCard> cards;
    private int size;// the size of the grouping

    /**
     * When game starts, create a group of cards randomly.
     */
    public GroupOfCards() {
        cards = new ArrayList<>();
        String[] suits = { "♠", "♥", "♦", "♣" };
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new PokerCard(i, suit));
            }
        }
    }

    /**
     * @param size set the amount of the current group of card while instantiating
     *             the GroupOfCards class.
     */
    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PokerCard> getCards() {
        return cards;
    }

    /**
     * change the order randomly of one pile of cards.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     *
     * @param numCards the amount of cards one user should be hold.
     * @return Return one group of cards after we set how many cards this group
     *         should have.
     */
    public ArrayList<PokerCard> deal(int numCards) {
        ArrayList<PokerCard> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(cards.size() - 1));
        }

        return dealtCards;
    }

    /**
     * Check if the user still has cards in their hands.
     *
     * @return if the user still has cards in their hand, return false, otherwise
     *         return true.
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}// end class
