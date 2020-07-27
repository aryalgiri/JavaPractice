//26.	Write a Program to reverse the given number. //123 => 321

package Assignment;

import java.util.Scanner;

public class Q26ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int rem, rev = 0;
        while (number != 0) {
            rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.println(rev);
    }
}
