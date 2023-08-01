// Q4- Write a program to print all Armstrong numbers between 1 to n.
// Input:
// 1000
// Expected Output:
// 153
// 370
// 371
// 407

import java.util.*;

public class Ques24 {
    public static void main(String[] ankit) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = keyboard.nextInt();
        int num=1;
        while(num<=n){
            int count = 0;
            int i = num;
            while(i>0){
                count++;
                i=i/10;
            }
            
            int value = num;
            int sum =0;
            while(value >0){
                int digit = value%10;
                sum +=  Math.pow(digit,count);
                value= value /10;
                if(sum >value){
                    continue;
                }
            }
            if(sum == num){
                System.out.println(num);
            }
            num++;
        }
        keyboard.close();
    }
}
