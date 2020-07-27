//5.	Write a program to find the area of circle, rectangle, and triangle.

package Assignment;

import java.util.Scanner;

public class Q5Area {
    public static void main(String[] args) {

        // Area of a circle
        final double  PI= Math.PI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius=sc.nextFloat();
        float circleArea= (float) (PI*radius*radius);
        System.out.println("The Area of the circle with radius "+radius+ " is: "+ circleArea);

        // Area of a rectangle
        System.out.println("Enter the length of a rectangle");
        float length=sc.nextFloat();
        System.out.println("Enter the breadth of a rectangle");
        float breadth=sc.nextFloat();
        float areaRectangle=length*breadth;
        System.out.println("The area of the rectangle with length "+length+ " and "+ " breadth "+breadth+ " is: "+ areaRectangle);

        // Area of a triangle
        System.out.println("Enter the base of a triangle: ");
        float base =sc.nextFloat();
        System.out.println("Enter the height of a triangle: ");
        float height=sc.nextFloat();
        float areaTriangle= (float) (0.5*base*height);
        System.out.println("The area of the triangle with base "+base+ " and "+ " height "+ height+ " is: "+ areaTriangle);

    }
}
