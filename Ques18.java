// Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
// or Loss.

// Explanation : Formula for profit and loss
// Profit = S.P - C.P
// Loss = C.P - S.P
// (S.P is Selling Price and C.P is Cost Price)

// Simple input:
// Enter cost price: 4000
// Enter selling price: 9560
// Simple output:
// Profit = 5560

import java.util.*;

public class Ques18 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        int cp = keyboard.nextInt();
        System.out.println("Enter the Selling price: ");
        int sp = keyboard.nextInt();

        if (cp > sp) {
           int  loss = cp - sp;
            System.out.print("The loss value is : " + loss);
        } else if (cp < sp) {
           int  profit = sp - cp;
            System.out.print("The profit value is : " + profit);
        } else {
            System.out.print("No Profit No Loss");
        }

        keyboard.close();
    }

}
