//9.	Write a program that converts pounds into kg. The program prompts the user to enter
//number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg].
package Assignment;

import java.util.Scanner;

public class Q9WeightConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double poundToKgFactor=0.453592;
        System.out.println("Enter the weight in pounds:");
        float pounds=sc.nextFloat();
        float kg= (float) (poundToKgFactor*pounds);
        System.out.println(pounds+"pounds is "+ kg+ " kg");
    }
}
