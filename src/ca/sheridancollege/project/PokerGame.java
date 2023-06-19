/**
 * @author Shuya Hu, Sichao Quan, Min Liu, Wanqin Liang
 * @date June 19, 2023
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
    Scanner scanner = new Scanner(System.in);

    // Firstly, print hands of players
    for (Player player : getPlayers()) {
        CardGamePlayer cardPlayer = (CardGamePlayer) player;
        System.out.println("\n" + player.getName() + ", your current hand is:");
    for (int i = 0; i < cardPlayer.getHand().size(); i++) {
        String cardString = (i + 1) + ". " + cardPlayer.getHand().get(i);
        System.out.printf("%-12s", cardString);
        // Add a space line every 5 cards
        if ((i + 1) % 5 == 0) {
            System.out.println();
    }
        }

        // print the pile, let the player know what happened
        System.out.println("\nCurrent game pile: " + pile);


        // ask player 1 to throw a card
        while (true) {
            try {
                System.out.println("\n" + player.getName() + ", please input the number of the card you want to play:");
                int cardIndex = Integer.parseInt(scanner.nextLine());

                PokerCard playedCard = cardPlayer.getHand().get(cardIndex - 1);
                cardPlayer.getHand().remove(cardIndex - 1);
                pile.add(playedCard);

                // annouce that player throw a card and print the pile
                System.out.println("\n" + player.getName() + " played: " + playedCard);
                System.out.println("\nCurrent game pile: " + pile);

                //compare with the newly thrown card value with the card values in the pile
                for (int i = pile.size() - 2; i >= 0; i--) {
                    if (pile.get(i).getValue() == playedCard.getValue()) {
                        System.out.println("Match found with " + pile.get(i));

                        // Add the matching cards to the player's hand
                        while (pile.size() > i) {
                            cardPlayer.getHand().add(pile.remove(i));
                        }
                        // annouce the hand again
                        System.out.println(player.getName() + "'s hand now: " + cardPlayer.getHand());
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

    @Override
    public void declareWinner() {
    if (getPlayers().get(0).getHand().isEmpty()) {
        System.out.println("!!!" + getPlayers().get(1).getName() + " wins!!!");
    } else if (getPlayers().get(1).getHand().isEmpty()) {
        System.out.println("!!!" + getPlayers().get(0).getName() + " wins!");
    } else {
        System.out.println("It's a draw!"); // This line may not be necessary as per your game rules.
    }
    }

}
