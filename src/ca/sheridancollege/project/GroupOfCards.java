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

    // Create Poker Cards 4*13
    public GroupOfCards() {
       cards = new ArrayList<>();
         String[] suits = {"♠", "♥", "♦", "♣"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new PokerCard(i, suit));
            }
        }
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
         ArrayList<PokerCard> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(cards.size() - 1));
        }

          return dealtCards;
    }

    // Check if this deck of cards is empty.
    public boolean isEmpty() {
        return cards.isEmpty();
    }
}// end class
