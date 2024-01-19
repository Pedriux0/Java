package prime;

import java.util.Scanner;

public class experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = (int) (Math.random() * 10 + 1);
        System.out.println("Try to guess a number betweeen 1 and 10 :-): ");
        int input = sc.nextInt();
        int counter = 0;
        if (input == i){
            System.out.println("You did it");
            return;
        }
        while(input != i) {
        if(input > i){
            System.out.println("Higher");
        }
        if(input<i){
            System.out.println("Lower");
        }
        if(input > i || input < i){
            for(counter = 0; i != input; counter++){
                if(counter > 10);
                System.out.println("Too many tries");
                break;
            }
        }
        }
        /*
        boolean flag = false;
        System.out.println("Enter a number between 5 and 10: ");
        int input = sc.nextInt();
        if (input > 5 || input <10) {
            System.out.println("thank you");
        }
        System.out.println("Enter a number not in the range of 1 and 10: ");

        int input1 = sc.nextInt();
        if (input1 > 10){
            System.out.println("Yes");
            flag = true;
        }
        if (input1 < 10){
            System.out.println("No");
        }

        System.out.println("Please give me a number");

        int number = sc.nextInt();
        boolean flag = false;
        if (number == 1){
            System.out.println("1 is not a prime number");
        }else{
            int divisor = 2;
            while(divisor < number){
                if (number % divisor == 0){
                    flag = true;

                }
                divisor++;
            }
            if(flag == true){
                System.out.println("It is not a prime number");}
            else{
                System.out.println("It is a prime number");}
        }
        */
    }
}
