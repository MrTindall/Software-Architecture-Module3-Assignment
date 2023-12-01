package us.mattgreen.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author  Dr. Green
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param hand An Array of Cards
     * @return True if there are two of a kind and false if not
     */

    public static boolean twoOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOFmatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    public static boolean threeOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOFmatches = 0;
        for(int i=0;i < hand.length-2; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace()) && hand[i].getFace().equals(hand[i+2].getFace()))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean fourOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOFmatches = 0;
        for(int i=0;i < hand.length-3; i++) {
            if (hand[i].getFace().equals(hand[i + 1].getFace()) &&
                    hand[i].getFace().equals(hand[i + 2].getFace()) &&
                    hand[i].getFace().equals(hand[i + 3].getFace())) {
                return true;
            }
        }
        return false;
    }

    public static boolean flush(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getSuit().compareTo(b.getSuit()));
        int count = 1;
        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getSuit().equals(hand[i + 1].getSuit())) {
                count++;
                if (count == hand.length) {
                    return true; // All cards have the same suit, indicating a flush
                }
            } else {
                count = 1;
            }
        }
        return false; // No flush found
    }

    public static boolean fullHouse(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        boolean threeOfAKind = false;
        boolean pair = false;

        for (int i = 0; i < hand.length - 2; i++) {
            if (hand[i].getFace().equals(hand[i + 1].getFace()) &&
                    hand[i].getFace().equals(hand[i + 2].getFace())) {
                threeOfAKind = true;
            }
        }

        for (int i = 0; i < hand.length - 1; i++) {
            if (hand[i].getFace().equals(hand[i + 1].getFace())) {
                pair = true;
            }
        }

        return threeOfAKind && pair;
    }


}
