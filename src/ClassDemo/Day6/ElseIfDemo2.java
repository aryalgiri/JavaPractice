package ClassDemo.Day6;

import javax.swing.*;

public class ElseIfDemo2 {
    public static void main(String[] args) {
        int marks= Integer.parseInt(JOptionPane.showInputDialog("Enter marks: "));
        if (marks>=80 && marks <=100){
            System.out.println("distinction");
        } else if(marks>=60 && marks<=79){
            System.out.println("first");
        } else if (marks >= 45 && marks <= 69) {
            System.out.println("second");
        } else if(marks>=35&& marks<=44) {
            System.out.println("third");
        } else {
            System.out.println("fail");
        }
        System.out.println("more code");
        System.out.println("exit");
    }
}
