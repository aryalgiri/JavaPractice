//30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

package Assignment;

import java.util.Scanner;

public class Q30FibonacciSeries {
    static int a=0, b=1,c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        Q30FibonacciSeries ob = new Q30FibonacciSeries();
        System.out.println(num+" numbers in Fibonacci series starting from 0 are: ");
        System.out.println(a+"\n"+b);
        ob.printFibonacci(num);
    }
    void printFibonacci(int i){
        if (i>=0){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFibonacci(i-1);
        }
    }
}
