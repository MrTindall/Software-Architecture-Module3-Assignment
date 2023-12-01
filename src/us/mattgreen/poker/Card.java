package us.mattgreen.poker;


/**
 * The Card class represents a playing card with a face, suit, and value.
 */

public class Card {
    private Face face;
    private Suit suit;
    private int value;

    /**
     * Constructs a new Card with the given face, suit, and value.
     *
     * @param face  The face value of the card (e.g., ACE, TWO, JACK, etc.).
     * @param suit  The suit of the card (e.g., CLUBS, HEARTS, etc.).
     * @param value The numerical value of the card.
     */

    public Card(Face face, Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Retrieves the face value of the card.
     *
     * @return The face value of the card.
     */

    public Face getFace() {
        return face;
    }

    /**
     * Retrieves the suit of the card.
     *
     * @return The suit of the card.
     */

    public Suit getSuit() {
        return suit;
    }

    /**
     * Retrieves the numerical value of the card.
     *
     * @return The numerical value of the card.
     */

    public int getValue() {
        return value;
    }
}
