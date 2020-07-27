//11.	Write a program to swap two numbers
//a) using temp variable
//b) without temp variable

package Assignment;

public class Q11SwapNumbers {
    public static void main(String[] args) {
        int x=15;
        int y=10;
        System.out.println("Numbers before swapping:"+"\n"+"x= "+x+"\n"+ "y= "+y );
        // a. Swapping using temp variable
        int t=x;
        x=y;
        y=t;
        System.out.println("Numbers after swapping:"+"\n"+"x= "+x+"\n"+ "y= "+y );
        // b. Swapping without using temp variable
        x=x+y;  // x=25
        y=x-y;  // y=10
        x=x-y;
        System.out.println("Numbers after re-swapping:"+"\n"+"x= "+x+"\n"+ "y= "+y );




    }
}
