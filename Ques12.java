// Q2 - Swap two numbers without the use of third variable.
// Input: 5 10
// Output: 10 5

import java.util.*;
public class Ques12 {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the two  number using space: ");
        int firstNumber = keyboard.nextInt();
        int secondNumber= keyboard.nextInt();
       
        firstNumber = firstNumber+ secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("After swapping: " + firstNumber +  " "+ secondNumber);
        keyboard.close();
    }
    
}
