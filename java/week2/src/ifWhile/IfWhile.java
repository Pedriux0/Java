package ifWhile;

import java.util.Scanner;

public class IfWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          /* line of code
        System.out.println("How old are you ?");
        int age = sc.nextInt();
        // Our first if condition ( si o no marino )
        if (age >= 18){
            System.out.println("You are an adult");
            System.out.println("Access granted");
        } else {
            System.out.println("You're a minor");
            System.out.println("Access not granted");
        }
        if (age >= 18 && age < 65){
            System.out.println("You're an adult but not a Senior");
        } else if (age>=65){
            System.out.println("You're a senior");
        } else {
            System.out.println("You're a child");
        }


        if (!(age == 19 || age == 29)){ // not is "!"
            System.out.println("You're prime");
        } else {
            System.out.println("You're not prime");
        }


        System.out.println("Can you say hello");
        String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("HELLO")){
                System.out.println("Hello too, good morning , how do you feel today ?");
            } else{
                System.out.println("Why you didn't say hello");
            }


        int count = 10; // initialize
        while(count >= 1){
            int a = 1;
            System.out.println(count);
            count -= 1; // count = count - 1

        }
        System.out.println("Loop End");
          */
        // Very important (Scoping):
        // A variable is accessible after : 1- after it is declared
        // 2 - within its code block
        System.out.println("Input 10 numbers: ");
        double biggestSoFar = -Double.MAX_VALUE;
        double leastSoFar = Double.MAX_VALUE;
        double total = 0;
        int i = 0;

        while(i < 10) {

            double nextNum = sc.nextDouble();
            if (nextNum > biggestSoFar)  // biggestSoFar= 1000
            {
                biggestSoFar = nextNum;
            }
            if (nextNum < leastSoFar)  // lowestSofar = 10
            {
                leastSoFar = nextNum;
            }
            total += nextNum;
            i++; // i = i + 1;
        }
        System.out.println("Range: " + (biggestSoFar - leastSoFar));
        System.out.println("Average: " + total/10);
        }



}
