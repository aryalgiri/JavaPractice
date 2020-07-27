/*25.	Write a program that prompts the user to enter the number of students and each student’s name and score.
        Finally display the student with highest score.*/

package Assignment;

import java.util.Scanner;

public class Q25HighestScoreUsingUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        System.out.print("Enter a student name: ");
        String student1 = sc.next();

        System.out.print("Enter a student score: ");
        double score1 = sc.nextDouble();

        for (int i = 0; i < numberOfStudents - 1; i++) {
            System.out.print("Enter a student name: ");
            String student = sc.next();

            System.out.print("Enter a student score: ");
            double score = sc.nextDouble();

            if (score > score1) {
                student1 = student;
                score1 = score;
            }
        }

        System.out.println("Highest scoring student: "+"\n=======================");
        System.out.println(student1 + " : " + score1+ "\n----------------------");
    }
}