/*31.	Write a Program display following patterns.
        1
        12
        123
        1234
        12345*/


package Assignment;

import java.util.Scanner;

public class Q31PrintNumberPattern {
    //static int i,j;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for a pattern: ");
        int numRows=sc.nextInt();
        System.out.println("The required pattern: ");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(j+"");
                }
                System.out.println();
            if (i>1) {
                System.out.println();
            }
            }

        }

    }




