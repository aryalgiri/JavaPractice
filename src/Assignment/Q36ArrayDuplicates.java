//36.	Write a function to find duplicate elements in an array.

package Assignment;

public class Q36ArrayDuplicates {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 2, 6, 4, 3, 3, 3, 6};
        // sorting the array in ascending orders
        int i;
        for (i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The array in ascending order is: ");
        // printing the sorted array
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("----------------------");
        // finding the duplicates
        System.out.println("The duplicate elements are: ");
        for (i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j] && (i != j))
                {
                    System.out.println(array[j]+" ");
                }
            break;
            }
        }





            }

            }



