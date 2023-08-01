// Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
// negative or zero. Calculate the sum of numbers until a negative number is encountered. If the input is a negative number, 
// current sum is discarded and print -1.
// Input:
// 2
// 48
// 0
// 6
// -5
// 97
// Expected Output1:
// -1

import java.util.*;

public class Ques22 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        while (keyboard.hasNextInt()) {
            int num = keyboard.nextInt();
            if (num >= 0) {
                sum = sum + num;
            } else {
                sum = -1;
                break;
            }

        }
        System.out.println("The output : " + sum);

        keyboard.close();
    }

}
// import java.util.Scanner;
// public class Test {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int sum = 0;
// while(scn.hasNextInt()){ //check if input exists or not
// int num = scn.nextInt();
// if(num >= 0){ //if input is positive or zero add it to the current sum
// sum += num;
// }
// else{
// sum = -1;//input is negative so change sum to -1 and break out of the loop
// break;
// }
// }
// System.out.print(sum);
// }
// }