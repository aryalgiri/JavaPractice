/*28.	Write a program in single class having the following functions.
        a.	isPrimenumber(int)
        b.	firstNthPrime(int )
        c.	allPrimebetween(int start , int  end)*/


package Assignment;

import java.util.Scanner;

public class Q28PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q28PrimeNumbers ob = new Q28PrimeNumbers();
        ob.isPrime(sc);
        ob.firstNthPrime(sc);
        ob.allPrimeBetween(sc);
    }

    void isPrime(Scanner sc) {
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        int temp = 0;
        for (int i = 2; i <= num1 - 1; i++) {
            if (num1 % i == 0) {
                temp += 1;
            }
        }
        if (temp > 0) {
            System.out.println(num1 + " is not prime");
        } else {
            System.out.println(num1 + " is prime");
        }
    }

    void firstNthPrime(Scanner sc) {
        System.out.println("Enter nth number:");
        int nth = sc.nextInt();

        int i;
        int j = 1;
        int temp = 0;
        while (temp < nth) {
            j = j + 1;
            for (i = 2; i <= j; i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i == j) {
                temp += 1;
            }
        }
        System.out.println("The " + nth + "th " + "prime number is: " + j);

    }

    void allPrimeBetween(Scanner sc) {
        System.out.println("Enter starting number:");
        int start = sc.nextInt();
        System.out.println("Enter ending  number:");
        int end = sc.nextInt();
        System.out.println("The list of prime numbers between "+start+ " and "+end+ " are: ");
        while(start<=end) {
            int temp1 = 0;
            for (int i = 2; i <= start-1; i++) {
                if (start % i == 0) {
                    temp1+=1;
                }
            }
            if (temp1==0 && start != 0 && start != 1) {

                System.out.print(start + ", ");
            }
            start++;
            }

        }
    }
