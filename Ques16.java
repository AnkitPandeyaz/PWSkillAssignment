// Q1 - Write a program which takes the values of length and breadth from user and check if it is a square or
// not.

// Enter length:
// 5
// Enter breadth:
// 4
//output : It is rectangle

import java.util.*;
public class Ques16 {
    public static void main(String[]ankit){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length value:");
        int length = keyboard.nextInt();
        System.out.println("Enter the breadth value: ");
        int breadth = keyboard.nextInt();

        if(length!= breadth){
            System.out.println("It is rectangle.");
        }
        else if(length == breadth){
         System.out.println("It is square.");
        }
        keyboard.close();
    }
    
}
