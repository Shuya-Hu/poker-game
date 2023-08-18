/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 20, 2023
 */

package ca.sheridancollege.project;

public class CardGamePlayer extends Player {

    private int id;
    private int score;

    /**
     * This method creates new players for this game.
     *
     * @param name the player's name.
     * @param id   the player's id
     */
    public CardGamePlayer(String name, int id) {
        super(name);
        this.id = id;
        this.score = 0;
    }

    /**
     * get user's id.
     *
     * @return return current user's id.
     */
    public int getId() {
        return id;
    }

    /**
     * get user's current score.
     *
     * @return return current user's score.
     */
    public int getScore() {
        return score;
    }

    /**
     * Add scores to user when certain condition is met.
     *
     * @param scoreYouGet after one pile of cards is collected, the amount of
     *                    cards will be the actual scores added to the current user.
     */
    public void setScore(int scoreYouGet) {
        this.score += scoreYouGet;
    }

    /**
     * One round of play for one user. Remove one card from the card pile.
     */
    @Override
    public void play() {
        // Implement the logic to play a card here.
        // For example, remove the top card from the player's hand and add it to the
        // pile.
        PokerCard card = super.getHand().remove(0);
        System.out.println(getName() + " plays " + card);
        // Add the card to the pile...
    }
}