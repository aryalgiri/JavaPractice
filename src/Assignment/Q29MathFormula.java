//29.	Write a Program for the following Mathematical.

package Assignment;

import java.util.Scanner;

public class Q29MathFormula {
    static int fact = 1;

    public static void main(String[] args) {
        //float b=1/2f;
        //System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        float a = 0f;

         for(int i=1; i<=n; i++){

        for (int j = i; j>=2; j--) {
            fact *= j;
            }

            a+= (float)i/(float)fact;
             }
            System.out.println(1+ a);
        }
    }
