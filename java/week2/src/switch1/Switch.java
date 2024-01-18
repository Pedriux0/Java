package switch1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type 1 = Hi or 2 = Bye ");
        int message = sc.nextInt();
        switch (message){
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Say something");
                break;
        }
    }
}
