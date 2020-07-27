//41.	Write a program to find the duplicate letter in a word.

package Assignment;

import java.util.Scanner;

public class Q41DuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        Q41DuplicateLetters ob=new Q41DuplicateLetters();
        System.out.println("The # of repetitions in the word "+str+ " are: ");
        ob.findDuplicateLetter(str);
    }

    void findDuplicateLetter(String str) {
        char[] chArr = str.toLowerCase().toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            int count=0;
            for (int j = i+1; j < chArr.length; j++) {
                if (chArr[i] == chArr[j]) {
                    count += 1;
                    chArr[j]=' ';
                    // after finding duplicate of a letter, chArr[j] is set to blank
                    // to avoid searching duplicates for the already visited letter.
                }
            }
            //Displays the duplicate letter if count is greater or equal to 1
            if(count>=1 && chArr[i]!=' '){
                System.out.println(chArr[i]+" ("+count+" times)");
            }
        }
    }
}
