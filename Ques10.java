
// Q5 - Given few lines of input(number of lines unknown) where each line has two
// strings, concatenate the strings.
// Input :
// Hello World
// Happy Faces
// Sunny Day
// Good Morning
import java.util.*;

public class Ques10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the string using space: ");

        while (keyboard.hasNextLine()) {
            System.out.println( "");
            String a = keyboard.next();
            String b = keyboard.next();
            System.out.println(a + b);
        }

        keyboard.close();
    }
}
