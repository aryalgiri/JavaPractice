//34.	Write a program to reverse the element of an array.

package Assignment;

import java.util.Scanner;

public class Q34ArrayReverse {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the array elements: ");
        arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        Q34ArrayReverse ob = new Q34ArrayReverse();
        System.out.println("---------------");
        System.out.println("The original array is: ");
        ob.printArray(arr);
        ob.reverseArray(arr);
        System.out.println("The reversed array is: ");
        ob.printArray(arr);
    }

    void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------");
    }

    void reverseArray(int[] arr) {
        for (int j = 0; j < (arr.length) / 2; j++) {
               int temp = arr[j];
                arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;

            }
        System.out.println("\n---------------");
    }



}