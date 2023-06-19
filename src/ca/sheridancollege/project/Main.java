
package ca.sheridancollege.project;

/**
* @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // Create players
        CardGamePlayer player1 = new CardGamePlayer("Liu",1);
        CardGamePlayer player2 = new CardGamePlayer("Zhang",2);

        // Create PokerGame
        PokerGame game = new PokerGame("Card Game 2023");

        game.getPlayers().add(player1);
        game.getPlayers().add(player2);

        for (Player player : game.getPlayers()) {
        ArrayList<PokerCard> initialHand = game.getDeck().deal(26);
        player.setHand(initialHand);
        }


    while (!game.getPlayers().get(0).getHand().isEmpty() && !game.getPlayers().get(1).getHand().isEmpty()) {
        game.play();
    }

    game.declareWinner();


    }
}