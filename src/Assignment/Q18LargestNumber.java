//18.	Write a program to display largest number from given three values.

package Assignment;

import java.util.Scanner;

public class Q18LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        if (a >= b)
        {
            if (a>=c)
            {
                System.out.println(a + " is the largest number among" + a + ", " + b + ", and" + c);
            }
            else {
                System.out.println(c + " is the largest number among" + a + ", " + b + ", and" + c);
            }

        }
        else {
            if(b<=c)
            {
                System.out.println(c + " is the largest number among " + a + ", " + b + ", and " + c);
            }
            else {

                    System.out.println(b + " is the largest number among" + a + ", " + b + ", and" + c);

                }
            }
        }
    }

