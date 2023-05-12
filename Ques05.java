/* Q5 - Write a Java program to swap two numbers with the help of a third variable.
 * Sample Input : 2,3
   Sample Output : 3,2
 */

public class Ques05 {
    public static void main(String[] args) {
        System.out.println("Swapping of two number.");

        int a = 2;
        int b = 3;

        System.out.println("Before swapping " + "a = " + a + " b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping " + " a = " + a + " b = " + b);

    }
}
