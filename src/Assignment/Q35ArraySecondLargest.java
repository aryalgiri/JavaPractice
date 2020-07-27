//35.	Write a function to find second largest number in given array.

package Assignment;

public class Q35ArraySecondLargest {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6};
        int i;
        // sorting the array
        for( i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]<array[j]){
                    int temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("The array in descending order is: ");
        // printing the sorted array
        for( i=0; i<array.length; i++) {
            System.out.println(array[i]+" ");
        }
        System.out.println("----------------------");
        System.out.println("Second largest element is: "+array[1]);
    }
}
