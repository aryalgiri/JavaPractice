package ClassDemo.Day7;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choice");
        String choice=input.next();

        switch(choice){
            case "add":
                System.out.println("this is addition");
                break;
            case "sub":
                System.out.println("this is subtraction");
                break;
            case "mul":
                System.out.println("this is multiplication");
                break;
            case "div":
                System.out.println("this is division");
                break;
            default:
                System.out.println("wrong choice!!!");
        }
        System.out.println("exit from switch-case");
    }
}
