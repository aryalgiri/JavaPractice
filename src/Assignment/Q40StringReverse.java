//40.	Write a program to reverse the string.

package Assignment;

import java.util.Scanner;

public class Q40StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        char [] chArr = str.toCharArray();
        System.out.println("The original string is: ");
        for (int i : chArr) {                  //printing the string
            System.out.println((char) i);
        }
        Q40StringReverse ob=new Q40StringReverse();
        System.out.println("The reversed string is: ");
        ob.reverseString(chArr);

    }
    void reverseString(char[] chArr){
    char [] ch=new char[chArr.length];
        for(int i=0; i<chArr.length; i++){
            ch[i]=chArr[chArr.length-i-1];
        }
        System.out.println(new String(ch));
    }
    /* Alternatively
    for(int i=0; i<chArr.length/2; i++){
            char temp=chArr[i];
            chArr[i]=chArr[chArr.length-i-1];
            chArr[chArr.length-i-1]=temp;
    }
    for (int i:chArr){
        System.out.println((char)i);
    }
    }*/
}
