
// Q4 - Given two numbers, return their sum in the following format:
// Int t representing number of test cases
// T lines of Two integers representing the numbers to be added
// Input :
// 3
// 4 5
// 18 20
// 49 27
// Output :
// 9
// 38
// 76

import java.util.*;

public class Ques09 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter how many test case number you want? ");
        int t = keyboard.nextInt();
        int[] sum = new int[t];

        for (int i = 0; i <t; i++) {
            System.out.println("Test case" + (i+1) + " :" + "Enter two the number using space: ");
            int num1 =keyboard.nextInt();
            int num2 =keyboard.nextInt();
            sum[i] = num1 +num2;
    
        }
        System.out.println("Sum of each test case:");
        for (int i = 0; i < t; i++) {
            System.out.println( sum[i]);
        }
        keyboard.close();


    }
}
