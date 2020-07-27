//38.	Write a program to check whether given string is palindrome or not.

package Assignment;

import java.util.Scanner;

public class Q38StringPalindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
//comparing characters at the beginning and the end of a string and moving towards its middle.
        int length  = str.length();
        int i, start, end, mid;

        start  = 0;
        end    = length - 1;
        mid = (start + end)/2;

        for (i = start; i <= mid; i++) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else
                break;
        }
        if (i == mid + 1)
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palindrome");
    }
}

