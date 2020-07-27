//7.	Write a program that read the radius and length of a cylinder and computes volume.

package Assignment;

import java.util.Scanner;

public class Q7Cylinder {
    public static void main(String[] args) {
        final double  PI= Math.PI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of a cylinder:");
        float radius=sc.nextFloat();
        System.out.println("Enter the length(or height) of a cylinder:");
        float length=sc.nextFloat();
        float volumeCylinder= (float) (PI*radius*radius*length);
        System.out.println("The volume of the cylinder with radius "+radius+ " is: "+ volumeCylinder);

    }
}
