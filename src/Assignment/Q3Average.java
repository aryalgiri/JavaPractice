// Q3.	Write a program to find sum and average of two numbers input by User (using Scanner class).
package Assignment;

import java.util.Scanner;

public class Q3Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a=s.nextFloat();
        System.out.println("Enter the second number:");
        float b=s.nextFloat();
        float sum=a+b;
        float average=(a+b)/2;
        System.out.println("The sum of " +a+ " and " +b+ " is: "  + sum);
        System.out.println("The average of " +a+ " and " +b+ " is: " + average);


        // Alternatively,

        /* float a= Float.parseFloat(JOptionPane.showInputDialog("Enter the first number:"));

        float b= Float.parseFloat(JOptionPane.showInputDialog("Enter the second number:"));
        float sum=a+b;
        float average= (a+b)/2;

    JOptionPane.showMessageDialog(null, "The sum of " + a + " and " + b + " is: "  + sum);
    JOptionPane.showMessageDialog(null, "The average of " + a + " and " + b + " is: "  + average);
    */

    }
}
