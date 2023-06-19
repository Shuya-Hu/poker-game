/**
 * every player has a hand of poker cards.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 */
public abstract class Player {

    private String name; // the unique name for this player
    private ArrayList<PokerCard> hand; // the cards this player holds

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // Initialize the hand
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the player's hand of cards.
     *
     * @param hand the cards to set to this player's hand
     */
    public void setHand(ArrayList<PokerCard> hand) {
        this.hand = hand;
    }

    /**
     * A method to get the player's hand of cards.
     *
     * @return the cards in this player's hand
     */
    public ArrayList<PokerCard> getHand() {
        return this.hand;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your
     * specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
