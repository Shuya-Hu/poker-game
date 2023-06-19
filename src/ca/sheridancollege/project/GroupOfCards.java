package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for
 * reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 */
public class GroupOfCards {

    // The group of cards, stored in an ArrayList
    private ArrayList<PokerCard> cards;
    private int size;// the size of the grouping

    // Create Poker Cards 4*13
    public GroupOfCards() {
        // todo: Implement group of cards to create pocker cards
    }

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

    // Deal Poker Cards to Players
    public ArrayList<PokerCard> deal(int numCards) {
        // todo: implement the deal method.

        return new ArrayList<>();
    }

    // Check if this deck of cards is empty.
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}// end class
