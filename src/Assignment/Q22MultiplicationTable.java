//22.	Write a program to print the table of given number.

package Assignment;

import java.util.Scanner;

public class Q22MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for (int i=1; i<=10;i++ ){
            System.out.println(num+ " * "+ i+ " = "+ (num*i));
        }

    }
}
