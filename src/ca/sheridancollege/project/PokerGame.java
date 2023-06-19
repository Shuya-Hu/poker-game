/**
* @author dancye
* @author Paul Bonenfant Jan 2020
* @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
*/

package ca.sheridancollege.project;

import java.util.ArrayList;

public class PokerGame extends Game {

    private ArrayList<PokerCard> pile; // the cards that thrown by the players
    private ArrayList<PokerCard> hand; // cards in players' hands
    private GroupOfCards deck; // All the cards for this game

    /**
     * Constructor that creates a CardGame with the given name.
     *
     * @param name The name of the game.
     */

    public PokerGame(String name) {
        super(name);
        pile = new ArrayList<>();
        deck = new GroupOfCards();
        deck.shuffle();
    }

    public GroupOfCards getDeck() {
        return deck;
    }

    public ArrayList<PokerCard> getHand() {
        return this.hand;
    }

    public void setHand(ArrayList<PokerCard> hand) {
        this.hand = hand;
    }

    /**
     * This method manages the gameplay. It is responsible for dealing cards,
     * managing turns and determining the winner.
     */
    @Override
    public void play() {
        // todo: implement the concrete play logic here
    }

    @Override
    public void declareWinner() {
        // todo: implement the win/lose logic here
    }

}
