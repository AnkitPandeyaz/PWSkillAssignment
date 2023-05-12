/*Q4 - Write a Java program to calculate the cube of a number. 
Sample Input : 4
Sample Output : 64
The sizeof(bool) : 1 bytes */

import java.util.*;
public class Ques04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        int cube = num * num * num;
        System.out.println("The cube of " + num + " is " + cube);
        keyboard.close();
    }
    
}
