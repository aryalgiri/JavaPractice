// Calculation taking user inputs from console

package ClassDemo.Day2;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a=sc.nextInt();
        System.out.println("Enter the second integer:");
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println(a + " + " + b + " = "+ add);
        System.out.println(a + " - " + b + " = "+ sub);
        System.out.println(a + " * " + b + " = "+ mul);
        System.out.println(a + " / " + b + " = "+ div);
    }
}
