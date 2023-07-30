/*Q1 - Input name, roll number and field of interest from user and print in the format below :
Name: xyz, Roll number: xyz, Field of interest: xyz
Input : Single line format
Aman Gupta 4053 Physics
Output :
Name: Aman Gupta
Roll Number: 4053
Field of interest: Physics */

import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name, roll number, and field of interest separated by space: ");
        String input = keyboard.nextLine();

        String[] values = input.split(" ");

        System.out.println("Name: " + values[0] + " " + values[1]);
        System.out.println("Roll Number: " + values[2]);
        System.out.println("Field of Interest: " + values[3]);
        keyboard.close();
    }
}

