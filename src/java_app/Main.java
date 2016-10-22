package java_app;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Guess the number");
        for(int i=10; i<=30; i+=10) playLevel(i);
        System.out.println("You win!");

        scanner.close();


    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while(true) {
            System.out.println("Guess the digit from 0 to " + range);
            int input_number = scanner.nextInt();
            if(input_number == number) {
                System.out.println("You guess the digit!");
                break;
            } else if(input_number > number) {
                System.out.println("Digit is lower");
            } else {
                System.out.println("Digit is bigger");
            }
        }
    }
}
