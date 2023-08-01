// Q4 - Write a program to print positive number entered by the user, if user enters a negative number, it is
// skipped.

// Simple input: Enter an integer: -6

// Simple output: The number is negative and skipped

import java.util.*;

public class Ques19 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int integer = keyboard.nextInt();

        if (integer >= 0) {
            System.out.println("Your number is  positive number");
        } else {
            System.out.println("The number is negative and skipped.");
        }

        keyboard.close();

    }

}
