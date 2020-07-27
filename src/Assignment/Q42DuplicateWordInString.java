package Assignment;

import java.util.Scanner;

public class Q42DuplicateWordInString {
    public static void main(String[] args) {
        String s=" ";
        System.out.println("the string is:"+ s+ "hey");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a phrase");
       // String string = "I took a bus to take a next Bus to a store and I came back in the second bus";
        String str=sc.nextLine();

        //Split the string into wordArr using built-in function using whitespace (after converting to lowercase)
        String[] wordArr = str.toLowerCase().split(" ");

        System.out.println("Duplicate wordArr in a given string are: ");
        for(int i = 0; i < wordArr.length; i++) {
            int count = 0;
            for(int j = i+1; j < wordArr.length; j++) {
                if(wordArr[i].equals(wordArr[j])) {
                    count++;
                    //Set wordArr[j] to empty space to avoid searching duplicates for already visited word
                    wordArr[j] = " ";
                }
            }

            //Displays the duplicate word if count is greater or equal to 1
            if(count >= 1 && !wordArr[i].equals(" "))
                System.out.println(wordArr[i]+" ("+count+" times)");
        }
    }
}

