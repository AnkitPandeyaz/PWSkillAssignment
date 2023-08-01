// Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
// is taken with 5 and then multiply the resultant value by 5. Display the final result.
// Input: 2345
// Output: 20


import java.util.*;
public class Ques11 {
    public static void main(String [] agrs){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the numbre: ");
        int x = keyboard.nextInt();
         x = ((((x+8) /3) %5)*5);
        System.out.println(x);
        keyboard.close();
    }
    
}
