// Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
// Input: 132
// Output: 6

import java.util.*;

public class Ques13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the 3 digit number: ");
        int number = keyboard.nextInt();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of three digit is: " + sum);
        keyboard.close();
    }

}
