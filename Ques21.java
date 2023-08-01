
// Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
// Input1:
// 6
// Output1:
// 1 ,1 ,2 ,3 ,5 ,8
// Input2:
// 2
// Output2:
// 1,1

import java.util.*;
public class Ques21 {
    public static void main(String[] ankit){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number you want to do fibonacci series: ");
        int n = keyboard.nextInt();
        int a= 1;
        int b= 1;

        for(int i=1; i<=n;i++){
            System.out.println(a + "");
            int sum = a+b;
            a = b;
            b= sum;
        
        }
        keyboard.close();
    }
    
}
