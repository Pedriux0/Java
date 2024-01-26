package exercise;

import java.util.Scanner;

public class tv {
    Scanner sc = new Scanner();

    Scanner channelInput = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please give me a channel between 1 to 1000");
    public static void main(String[] args) {
        hd h = new hd();
        System.out.println(h.getFinal());
    }
}
