package deck;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Example program demonstrating the use of DeckOfCards and Card classes.
 */
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Getting user input for the number of suits and ranks
        System.out.print("How many suits? ");
        int suits = scanner.nextInt();
        System.out.print("How many ranks? ");
        int ranks = scanner.nextInt();
        // Creating a DeckOfCards instance
        DeckOfCards deck = new DeckOfCards(suits, ranks);
        System.out.println(deck);
        int choice;
        do {
            System.out.println("\n1=shuffle, 2=deal 1 hand, 3=deal 100000 times, 4=quit: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deck.shuffle();
                    System.out.println(deck);
                    break;
                case 2:
                    System.out.print("How many cards? ");
                    int cards = scanner.nextInt();
                    // Dealing a hand
                    ArrayList<Card> hand = new ArrayList<>();
                    for (int i = 0; i < cards; i++) {
                        hand.add(deck.deal());
                    }
                    System.out.println(hand);
                    break;
                case 3:
                    int[] histogram = deck.dealHistogram(100000);
                    System.out.println("Histogram:");
                    for (int i = 0; i < histogram.length; i++) {
                        if (histogram[i] > 0) {
                            System.out.println(i + ": " + histogram[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("BYE!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}