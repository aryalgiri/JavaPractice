//13.	Write a program to print the number entered by user only if the number entered is negative.

package Assignment;

import java.util.Scanner;

public class Q13PrintNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        if (number<0) {
            System.out.println("The number is "+ number);
        } else{
            System.out.println("It's not negative");
        }
    }
}
