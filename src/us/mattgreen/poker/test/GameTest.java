package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;


/**
 * The GameTest class contains unit tests for the Game class methods related to poker hand evaluation.
 */
public class GameTest {
    private Card[] handTwoOfAKind;
    private Card[] handThreeOfAKind;
    private Card[] handFourOfAKind;
    private Card[] handFlush;
    private Card[] handFullHouse;

    @Before
    public void setUp() {
        handTwoOfAKind = new Card[]{new Card(JACK, CLUBS, 11), new Card(FIVE, CLUBS, 5), new Card(JACK, SPADES, 11)};
        handThreeOfAKind = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, SPADES, 11), new Card(JACK, HEARTS, 11)};
        handFourOfAKind = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, SPADES, 11), new Card(JACK, HEARTS, 11), new Card(JACK, DIAMONDS, 11)};
        handFlush = new Card[]{new Card(JACK, CLUBS, 11), new Card(THREE, CLUBS, 3), new Card(EIGHT, CLUBS, 8), new Card(FIVE, CLUBS, 5), new Card(TEN, CLUBS, 10)};
        handFullHouse = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, SPADES, 11), new Card(JACK, HEARTS, 11), new Card(TWO, DIAMONDS, 2), new Card(TWO, CLUBS, 2)};
    }


    /**
     * Tests the twoOfAKind method of the Game class.
     */
    @Test
    public void twoOfAKindTest() {
        assertTrue("Two of a kind should have matched",Game.twoOfAKind(handTwoOfAKind));
    }

    /**
     * Tests the threeOfAKind method of the Game class.
     */
    @Test
    public void threeOfAKindTest() {
        assertTrue("Three of a kind should have matched", Game.threeOfAKind(handThreeOfAKind));
    }

    /**
     * Tests the fourOfAKind method of the Game class.
     */
    @Test
    public void fourOfAKindTest() {
        assertTrue("Four of a kind should have matched", Game.fourOfAKind(handFourOfAKind));
    }

    /**
     * Tests the flush method of the Game class.
     */
    @Test
    public void flushTest() {
        assertTrue("Flush should have matched", Game.flush(handFlush));
    }

    /**
     * Tests the fullHouse method of the Game class.
     */
    @Test
    public void fullHouseTest() {
        assertTrue("Full house should have matched", Game.fullHouse(handFullHouse));
    }
}
