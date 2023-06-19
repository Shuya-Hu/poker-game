/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
 */

package ca.sheridancollege.project;

public class CardGamePlayer extends Player {

    public CardGamePlayer(String name, int id) {
        super(name);
    }

    @Override
    public void play() {
        // Implement the logic to play a card here.
        // For example, remove the top card from the player's hand and add it to the pile.
        PokerCard card = getHand().remove(0);
        System.out.println(getName() + " plays " + card);
    }
}