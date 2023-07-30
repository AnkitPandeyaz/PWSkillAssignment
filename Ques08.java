
// Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
// 100), write a program to calculate his total marks and percentage marks.
// Input :
// 78
// 89
// 95
// Output : Total marks: 262
// Percentage marks: 87%

import java.util.*;

public class Ques08 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first subject number: ");
        int mark1 = keyboard.nextInt();
        System.out.println("Enter the second subject number: ");
        int mark2 = keyboard.nextInt();
        System.out.println("Enter the third subject marks : ");
        int mark3 = keyboard.nextInt();
        int total = mark1 + mark2 + mark3;
        int percentage = (total) / 3;
        System.out.println("Total marks: " + total);

        System.out.print("Percentage marks: " + percentage + "%");
        keyboard.close();
    }

}
