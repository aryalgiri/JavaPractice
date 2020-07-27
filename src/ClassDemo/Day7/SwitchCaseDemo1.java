package ClassDemo.Day7;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println("this is addition");
                break;
                case 2:
                System.out.println("this is subtraction");
                break;
            case 3:
                System.out.println("this is multiplication");
                break;
            case 4:
                System.out.println("this is division");
                break;
            default:
                System.out.println("wrong choice!!!");
        }
        System.out.println("exit from switch-case");
    }

}
