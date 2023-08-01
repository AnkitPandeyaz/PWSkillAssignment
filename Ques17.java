// Q2 - Write a program to print absolute value of a number entered by the user.

// Sample Input : -1
// Sample Output: 1

import java.util.*;

public class Ques17 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value to change into absolute: ");
        int number = keyboard.nextInt();
        if (number < 0) {

            number = number * -1;
        }
        System.out.println("The absolute value are : " + number);
        keyboard.close();
    }

}
