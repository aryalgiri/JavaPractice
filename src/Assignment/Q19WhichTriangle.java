//19.	Write a Program to accept three sides of triangle and display which kind of triangle is formed.

package Assignment;

import java.util.Scanner;

public class Q19WhichTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of a triangle:");
        int a=sc.nextInt();
        System.out.println("Enter the second side of a triangle:");
        int b=sc.nextInt();
        System.out.println("Enter the third side of a triangle:");
        int c=sc.nextInt();
        if(a==b&&b==c) {
            System.out.println("It's an equilateral triangle");
        }
        else {
            if(a==b || b==c || a==c) {
                System.out.println("It's an isosceles triangle");

            }
            else{
                System.out.println("It's a scalene triangle");
            }

        }


    }
}
