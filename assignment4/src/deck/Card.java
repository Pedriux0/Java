package deck;
/**
 * Represents a playing card with a rank and a suit.
 */
public class Card {
    private final int rank;
    private final int suit;
    /**
     * Constructs a Card with the given rank and suit.
     *
     * @param rank The rank of the card.
     * @param suit The suit of the card.
     */
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    /**
     * Gets the rank of the card.
     *
     * @return The rank of the card.
     */
    public int getRank() {
        return rank;
    }
    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */

    public int getSuit() {
        return suit;
    }
    /**
     * Calculates and returns the value of the card (rank * suit).
     *
     * @return The value of the card.
     */
    public int getValue() {
        return rank * suit;
    }
    /**
     * Generates a string representation of the card.
     *
     * @return A string representation of the card.
     */
    @Override
    public String toString() {
        return String.format("Card(rank=%d, suit=%d)", rank, suit);
    }
}