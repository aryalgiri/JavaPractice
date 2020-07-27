package ClassDemo.Day8;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        /*  Syntax:
        for(initialization; condition; update){

        } */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
            System.out.println(i);
        }
        System.out.println("sum is: "+ sum);
        System.out.println("exit from loop...");
        input.close();
    }

}
