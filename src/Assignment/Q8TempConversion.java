//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.

package Assignment;

import java.util.Scanner;

public class Q8TempConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Conversion of Fahrenheit to Celsius
        System.out.println("Enter the temperature in Fahrenheit:");
        float fahrenheit=sc.nextInt();
        float celsius= (float) ((fahrenheit-32)/1.8);
        System.out.println("The Celsius equivalent of "+fahrenheit+" degree Fahrenheit is: "+ celsius+ " degree Celsius");

        // Conversion of Fahrenheit to Celsius
        System.out.println("Enter the temperature in degree Celsius:");
        celsius=sc.nextInt();
        fahrenheit= (float) (32+20*1.8);
        System.out.println("The Fahrenheit equivalent of "+celsius+" degree Celsius is: "+ fahrenheit+ " degree Fahrenheit");

    }
}
