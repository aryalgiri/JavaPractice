//15.	Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].

package Assignment;

import java.util.Scanner;

public class Q15ASCIIToChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an ASCII code");
        int number=sc.nextInt();
        char x= (char) number;
        System.out.println("The corresponding character for ASCII code "+ number+ " is: "+ x);
    }
}
