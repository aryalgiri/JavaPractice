//27.	Write a Program to sum each digit of given number as we XX ll as product. //456 =>4*5*6 and 4+5+6

package Assignment;

import java.util.Scanner;

public class Q27ProductAndSumOfDigits {
    static int prod=1;
    static int sum=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num != 0) {
            prod = prod * (num % 10);
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("The product of digits of " + num + "is: " + prod);
        System.out.println("The sum of digits of " + num + "is: " + sum);
    }
    }

