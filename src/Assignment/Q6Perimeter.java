// 6.	Write a program to find the perimeter of circle, triangle, and rectangle.

package Assignment;

import java.util.Scanner;

public class Q6Perimeter {
    public static void main(String[] args) {

        // Perimeter of a circle
        final double  PI= Math.PI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius=sc.nextFloat();
        float perimeterCircle= (float) (2*PI*radius);
        System.out.println("The perimeter of the circle with radius "+radius+ " is: "+ perimeterCircle);

        // Perimeter of a rectangle
        System.out.println("Enter the length of a rectangle");
        float length=sc.nextFloat();
        System.out.println("Enter the breadth of a rectangle");
        float breadth=sc.nextFloat();
        float perimeterRectangle=2*(length+breadth);
        System.out.println("The perimeter of the rectangle with length "+length+ " and "+ " breadth "+breadth+ " is: "+ perimeterRectangle);

        // Perimeter of a triangle
        System.out.println("Enter the base of a triangle: ");
        float base =sc.nextFloat();
        System.out.println("Enter the first side of a triangle: ");
        float side1=sc.nextFloat();
        System.out.println("Enter the second side of a triangle: ");
        float side2 =sc.nextFloat();
        float perimeterTriangle= base+side1+side2;
        System.out.println("The perimeter of the given triangle is: "+ perimeterTriangle);

    }
}



