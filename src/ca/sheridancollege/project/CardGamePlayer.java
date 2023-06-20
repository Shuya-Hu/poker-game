/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 20, 2023
 */

package ca.sheridancollege.project;

public class CardGamePlayer extends Player {

    private int id;
    private int score;

    public CardGamePlayer(String name, int id) {
        super(name);
        this.id = id;
        this.score = 0;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int scoreYouGet) {
        this.score += scoreYouGet;
    }

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