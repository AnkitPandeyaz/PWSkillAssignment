// Q3- Write a program to calculate the factorial of a number.
// Input:
// 5
// Expected Output:
// 120

import java.util.*;

public class Ques23 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = keyboard.nextInt();
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial number: " + factorial);
        keyboard.close();
    }

}
