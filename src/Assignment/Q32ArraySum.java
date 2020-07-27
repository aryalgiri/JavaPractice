//32.	Write a Program to accepts 5 values in array and display their sum.

package Assignment;

import java.util.Scanner;

public class Q32ArraySum {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        arr=new int[size];
        for (int i = 0; i <= size - 1; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        Q32ArraySum ob = new Q32ArraySum();
        System.out.println("---------------");
        System.out.println("The array elements are: ");
        ob.printArray(arr);

        System.out.println("The sum of the array is: "+ob.arraySum(arr));
    }
    int arrSum=0;
     void printArray(int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
         System.out.println("\n---------------");
    }

    int arraySum(int[] arr){
        for(int element:arr){
            arrSum+=element;
        }
        //System.out.println("The sum of the array is: "+arrSum);
    return arrSum;
     }


}





