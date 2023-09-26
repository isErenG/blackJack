package blackjack.players;

import blackjack.Deck;

import java.util.List;
import java.util.Scanner;

public class Player {

    public Integer wager(Scanner scanner) {
        System.out.println("How much do you wish to wager?");
        return scanner.nextInt();
    }

    public List<Integer> hit(List<Integer> playerHand, List<Integer> deck, Deck dealerDeck) {
        playerHand.add(deck.get(0));

        dealerDeck.calculateAces(playerHand);

        deck.remove(deck.get(0));
        return playerHand;
    }
}
