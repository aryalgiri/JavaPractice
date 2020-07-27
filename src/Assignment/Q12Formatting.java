//12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format way.

package Assignment;

import java.util.Scanner;

public class Q12Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a person: ");
        String name=sc.next();
        System.out.println("Enter the roll number: ");
        int rollNumber=sc.nextInt();
        System.out.println("Enter the nationality: ");
        String nationality=sc.next();
        System.out.println("The details of the person: \n==========================");
        System.out.println("Name: "+ name + "\nRoll Number: "+ rollNumber + "\nNationality: " +nationality);
    }

}
