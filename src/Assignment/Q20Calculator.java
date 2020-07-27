/*
20.	Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers and an operator.
        It then carries out the specified arithmetic operator operation: addition, subtraction, multiplication or division of the two numbers.
        Finally, it displays the result.
*/
package Assignment;

import java.util.Scanner;

public class Q20Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        System.out.println("Enter another number:");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator:");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operator not valid");
                    break;
            }
        }

    }
