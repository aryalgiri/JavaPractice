package ClassDemo.Day4;

public class OperatorDemo5 {
    public static void main(String[] args) {
        //Ternary(conditional) Operators
        int a=5;
        int b=6;
        if (a > b) {
            System.out.println("a si greater than b.");
        }else{
            System.out.println("b is greater than a");
        }
        System.out.println("=============");
        //Alternatively,
        String s=(a>b)? "a is greater than b." : "b is greater than a";
        System.out.println(s);
        System.out.println("-----------");

        boolean p=(a>b)? true:false;
        System.out.println(p);
    }
}
