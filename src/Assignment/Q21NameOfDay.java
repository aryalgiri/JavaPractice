//21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.

package Assignment;

import java.util.Scanner;

public class Q21NameOfDay {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7:");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();

       switch(day)
        {
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
            System.out.println("Not a valid number");
                break;

        }

    }
}
