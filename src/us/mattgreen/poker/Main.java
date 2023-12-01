package us.mattgreen.poker;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main class demonstrates a basic scenario of creating a hand of cards and evaluating poker hands.
 */
public class Main {
    /**
     * The main method creates a hand of cards and demonstrates its usage by evaluating different poker hands.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an ArrayList to represent a hand of cards
        List<Card> hand = new ArrayList<>();

        // Add cards to the hand
        hand.add(new Card(Face.JACK, Suit.CLUBS, 11));
        hand.add(new Card(Face.JACK, Suit.SPADES, 11));
        hand.add(new Card(Face.JACK, Suit.HEARTS, 11));
        hand.add(new Card(Face.TWO, Suit.DIAMONDS, 2));
        hand.add(new Card(Face.TWO, Suit.CLUBS, 2));

        // Evaluate different poker hands and display the results
        System.out.println("Two of a Kind: " + Game.twoOfAKind(hand.toArray(new Card[0])));
        System.out.println("Three of a Kind: " + Game.threeOfAKind(hand.toArray(new Card[0])));
        System.out.println("Four of a Kind: " + Game.fourOfAKind(hand.toArray(new Card[0])));
        System.out.println("Flush: " + Game.flush(hand.toArray(new Card[0])));
        System.out.println("Full House: " + Game.fullHouse(hand.toArray(new Card[0])));
    }
}
