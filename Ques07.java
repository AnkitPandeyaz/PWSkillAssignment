// Q2 - Input two different string and print them in same line.
// Input :
// Level
// Up
// Output :
// LevelUp
import java.util.*;
class Ques07 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first input: ");
        String input1 = keyboard.next();
        System.out.println("Enter the Second input: ");
        String input2 = keyboard.next();

        System.out.print(input1);
        System.out.println(input2);
        keyboard.close();
       
    }
}
