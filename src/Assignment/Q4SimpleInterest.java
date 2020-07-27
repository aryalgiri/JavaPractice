
// 4.	Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
package Assignment;

import java.util.Scanner;

public class Q4SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount in dollars: ");
        int principal = sc.nextInt();
        System.out.println("Enter the time in years");
        int time = sc.nextInt();
        System.out.println("Enter the interest rate in % : ");
        int rate = sc.nextInt();

        int simpleInterest= (principal*time*rate)/100;
        System.out.println("The simple interest of $"+principal+" @ "+ rate+" for "+ time+ " years is: ~$"+simpleInterest );

    }
}
