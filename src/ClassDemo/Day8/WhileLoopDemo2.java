package ClassDemo.Day8;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        boolean flag=true;
        Scanner input=new Scanner(System.in);
        while(flag){
            System.out.println("Enter name: ");
            String name=input.next();
            if(name.equals("giri")){
                flag=false;
            }
            System.out.println("name: "+name);
        }
        System.out.println("exit from while loop");
        input.close();
    }
}
