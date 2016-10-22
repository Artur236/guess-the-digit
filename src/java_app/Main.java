package java_app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");
        int range = 10;
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

        scanner.close();


    }
}
