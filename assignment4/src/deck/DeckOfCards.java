package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    /**
     * Represents a deck of playing cards.
     */
    private static final int MIN_RANK = 1;
    private static final int MAX_RANK = 13;
    private static final int MIN_SUIT = 1;
    private static final int MAX_SUIT = 4;
    private static final int NUM_DEALS = 100_000;

    private final List<Card> deck;

    /**
     * Constructs a deck of cards with the given number of suits and max rank.
     *
     * @param numSuits The number of suits in the deck.
     * @param maxRank  The maximum rank of the cards in the deck.
     * @throws IllegalArgumentException If numSuits or maxRank is outside the valid range.
     */
    public DeckOfCards(int numSuits, int maxRank) {
        if (numSuits < MIN_SUIT || numSuits > MAX_SUIT || maxRank < MIN_RANK || maxRank > MAX_RANK) {
            throw new IllegalArgumentException("Invalid number of suits or max rank");
        }

        deck = new ArrayList<>(numSuits * maxRank);

        for (int suit = MIN_SUIT; suit <= numSuits; suit++) {
            for (int rank = MIN_RANK; rank <= maxRank; rank++) {
                deck.add(new Card(rank, suit));
            }
        }

        shuffle();
    }
    /**
     * Shuffles the deck of cards.
     */
    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }
    /**
     * Deals a single card from the deck.
     *
     * @return The dealt card.
     * @throws IllegalStateException If the deck is empty.
     */
    public Card deal() {
        if (deck.isEmpty()) {
            throw new IllegalStateException("Deck is empty, cannot deal any more cards.");
        }
        return deck.remove(deck.size() - 1);
    }

    /**
     * Deals and records the histogram of total values of hands dealt.
     *
     * @param numDeals The number of hands to deal.
     * @return An array representing the histogram.
     * @throws IllegalArgumentException If numDeals is less than 1 or greater than NUM_DEALS.
     */
    public int[] dealHistogram(int numDeals) {
        if (numDeals < 1 || numDeals > NUM_DEALS) {
            throw new IllegalArgumentException("Invalid number of deals");
        }

        int[] histogram = new int[MAX_RANK * MAX_SUIT + 1];

        for (int i = 0; i < numDeals; i++) {
            List<Card> hand = dealHand(MAX_RANK);
            int value = 0;

            for (Card card : hand) {
                value += card.getValue();
            }

            histogram[value]++;
        }

        return histogram;
    }
    /**
     * Deals a hand of cards with the given number of cards.
     *
     * @param numCards The number of cards to deal.
     * @return A list representing the dealt hand.
     * @throws IllegalArgumentException If numCards is less than 1 or greater than the size of the deck.
     */
    public List<Card> dealHand(int numCards) {
        if (numCards < 1) {
            throw new IllegalArgumentException("Invalid number of cards");
        }

        List<Card> hand = new ArrayList<>(numCards);

        for (int i = 0; i < numCards; i++) {
            hand.add(deal());
        }

        return hand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Deck of cards: ");
        sb.append("size=").append(deck.size());
        sb.append(", minValue=").append(getValue(0));
        sb.append(", maxValue=").append(getValue(deck.size() - 1));
        sb.append(", topCard=").append(deck.get(deck.size() - 1));

        return sb.toString();
    }

    private int getValue(int index) {
        Card card = deck.get(index);
        return card.getRank() * card.getSuit();
    }
}