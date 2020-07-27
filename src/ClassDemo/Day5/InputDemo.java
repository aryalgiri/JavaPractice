package ClassDemo.Day5;

// next() reads single next word entered
// nextLine() reads next line

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name");
        String name=input.nextLine();
        System.out.println("Enter roll number: ");
        int rollNumber=input.nextInt();
        System.out.println("Enter Nationality");
        String nationality=input.next();
        System.out.println("+++++++++++++++++++");
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+ rollNumber);
        System.out.println("Nationality: "+nationality);
    }
}
