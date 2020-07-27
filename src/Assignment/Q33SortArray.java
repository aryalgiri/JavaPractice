//33.	Write a Program to display number in ascending order in array.

package Assignment;

import java.util.Scanner;

public class Q33SortArray {
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
        Q33SortArray ob = new Q33SortArray();
        System.out.println("---------------");
        System.out.println("The array before sort is: ");
        ob.printArray(arr);
        ob.arraySort(arr);
        System.out.println("The array after sort is: ");
        ob.printArray(arr);
    }

    void printArray(int [] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------");
    }
    void arraySort(int[] arr){
        for(int j=0; j<arr.length; j++){
            for(int k=j+1; k<arr.length;k++){
                if(arr[j]>arr[k]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
    }

}