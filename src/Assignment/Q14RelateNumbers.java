//14.	Write a program to relate two integers entered by user using = =or > or < sign.

package Assignment;

import java.util.Scanner;

public class Q14RelateNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        if (a==b){
            System.out.println(a +" = "+ b);
        } else if (a>b){
            System.out.println(a+" > "+b);
        } else{
            System.out.println(a+" < "+b);
        }
    }
}
