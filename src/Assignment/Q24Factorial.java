//24.	Write a program to print the factorial number of given numbers.

package Assignment;

import java.util.Scanner;

public class Q24Factorial {
    static int fact = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = sc.nextInt();
        Q24Factorial f = new Q24Factorial();
        f.factorial(n);
        System.out.println("The factorial of " + n + " is " + fact);
    }

        void factorial( int n)
        {
            if (n >= 1)
            {
                fact = fact * n;
                factorial(n - 1);

            }

        }

    }

/* Alternatively:
        for (int i=n; i>=1; i--)
        {
            fact*=i;
        }
        System.out.println("The factorial of "+ n+ " is "+ fact);
    */



