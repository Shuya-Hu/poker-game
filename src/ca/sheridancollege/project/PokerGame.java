/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 20, 2023
*/

package ca.sheridancollege.project;

import java.util.Scanner;
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

    /**
     *
     * @return get one whole deck of cards for this specific round of game.
     */
    public GroupOfCards getDeck() {
        return deck;
    }

    /**
     *
     * @return return the deck of cards in one user's hand.
     */
    public ArrayList<PokerCard> getHand() {
        return this.hand;
    }

    /**
     *
     * @param hand the initial deck of cards that is assigned to one user.
     */
    public void setHand(ArrayList<PokerCard> hand) {
        this.hand = hand;
    }

    /**
     * This method manages the game play. It is responsible for dealing cards,
     * managing turns and determining the winner.
     */
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        // Firstly, print hands of players
        for (Player player : super.getPlayers()) {
            CardGamePlayer cardPlayer = (CardGamePlayer) player;
            System.out.println("Player" + cardPlayer.getId() + "score: " + cardPlayer.getScore());

            System.out.println(
                    "\n" + player.getName() + ", you current have " + cardPlayer.getHand().size() + "card(s)");

            // print the pile, let the player know what happened
            System.out.println("\nCurrent game pile: " + pile);

            // ask player 1 to throw a card
            while (true) {
                try {
                    System.out.println(
                            "\n" + player.getName()
                                    + ", please select a random number (less than your current amount of cards) you want to play:");
                    int cardIndex = Integer.parseInt(scanner.nextLine());

                    PokerCard playedCard = cardPlayer.getHand().get(cardIndex - 1);
                    cardPlayer.getHand().remove(cardIndex - 1);
                    pile.add(playedCard);

                    // annouce that player throw a card and print the pile
                    // System.out.println("\n" + player.getName() + " played: " + playedCard);
                    System.out.println("\nCurrent game pile: " + pile);

                    // compare with the newly thrown card value with the card values in the pile
                    for (int i = pile.size() - 2; i >= 0; i--) {
                        if (pile.get(i).getValue() == playedCard.getValue()) {
                            System.out.println("Match found with " + pile.get(i));
                            System.out.println("You gained " + cardPlayer.getScore() + " scores");

                            cardPlayer.setScore(pile.size() - i);
                            // Add the matching cards to the player's hand
                            while (pile.size() > i) {
                                pile.remove(i);
                            }
                            // annouce the hand again
                            System.out.println(
                                    player.getName() + "'s hand now: " + cardPlayer.getHand().size() + " cards");
                            break;
                        }
                    }
                    break;

                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("\nInvalid input. Please try again.");
                }
            }

            System.out.println("\n----- End of " + player.getName() + "'s turn -----\n");
        }
    }

    /**
     * This method decide whether this game is over and when it's over, which player
     * is the winner.
     */
    @Override
    public void declareWinner() {
        if (((CardGamePlayer) (CardGamePlayer) getPlayers().get(0))
                .getScore() > ((CardGamePlayer) (CardGamePlayer) getPlayers().get(1)).getScore()) {
            System.out.println("!!!" + getPlayers().get(0).getName() + " wins!!!");
        } else if (((CardGamePlayer) (CardGamePlayer) getPlayers().get(0))
                .getScore() < ((CardGamePlayer) (CardGamePlayer) getPlayers().get(1)).getScore()) {
            System.out.println("!!!" + getPlayers().get(1).getName() + " wins!");
        } else {
            System.out.println("It's a draw!"); // This line may not be necessary as per your game rules.
        }
    }
}
