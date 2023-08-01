// Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication and division.

// Simple input:
// Enter an operator (+, -, *, /): -
// Enter two numbers:
// 6
// 8
// Simple Output:
// 6 - 8 = -2

import java.util.*;

public class Ques20 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(
                "Arithmatic operator \n" + "1:Addition\n" + "2:Subtraction\n" + "3:Multiplication\n" + "4:Division\n");

        System.out.println("What  arithmatic operation you want? ");
        int calculator = keyboard.nextInt();

        switch (calculator) {
            case 1:
                System.out.println("Enter two number using space: ");
                int num1 = keyboard.nextInt();
                int num2 = keyboard.nextInt();
                int add = num1 + num2;
                System.out.print("Additon of two number is: " + add);
                break;
            case 2:
                System.out.println("Enter two number using space: ");
                int num3 = keyboard.nextInt();
                int num4 = keyboard.nextInt();
                int sub = num3 - num4;
                System.out.print("Subtraction of two number is: " + sub);
                break;
            case 3:
                System.out.println("Enter two number using space: ");
                int num5 = keyboard.nextInt();
                int num6 = keyboard.nextInt();
                int mul = num5 * num6;
                System.out.print("Multiplication of two number is: " + mul);
                break;
            case 4:
                System.out.println("Enter two number using space: ");
                int num7 = keyboard.nextInt();
                int num8 = keyboard.nextInt();
                int divise = num7 / num8;
                System.out.print("Division of two number is: " + divise);
                break;

        }
        keyboard.close();
    }

}
