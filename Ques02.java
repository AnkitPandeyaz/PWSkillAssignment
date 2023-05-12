/*Q2 - Print the ASCII value of character ‘U’.
Sample Input : already mentioned as ‘U’
Sample Output : 85 */

import java.util.Scanner;

public class Ques02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a character of A-Z or a-z : ");
        char Alphabet = keyboard.next().charAt(0);
        int asciiValue = (int) Alphabet;
        System.out.println("The ASCII value of " + Alphabet + " is " + asciiValue);
        keyboard.close();
    }
}

