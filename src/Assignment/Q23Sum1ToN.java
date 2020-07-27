//23.	Write a Program to sum 1 to nth natural numbers.

package Assignment;

import java.util.Scanner;

public class Q23Sum1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("The sum of 1 to "+ n + " is : "+sum);
    }
}
