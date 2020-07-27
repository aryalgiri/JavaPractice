package ClassDemo.Day6;

public class IfElseDemo {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        if (a>b){  // true
            System.out.println("a is greater than b.");
        }
        if (b>a) {
            System.out.println("b is greater than a."); // this is redundant (performance bug)  because
        }                                               // second condition is checked even when first is true
        System.out.println("more code");
        System.out.println("exit");

      /*   That's why,

        if (a>=b){  // true
            System.out.println("a is greater than b.");
        } else{
            System.out.println("b is greater than a.");
        }*/

    }
    }

