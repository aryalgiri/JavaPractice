package ClassDemo.Day2;

public class Calculator1 {
    public static void main(String[] args) {
        // Direct calculation
        System.out.println(4+2);
        System.out.println(4-2);
        System.out.println(4*2);
        System.out.println(4/2);
        // Using variables
        int a=4;
        int b=2;
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println(a + " + " + b + " = "+ add);
        System.out.println(a + " - " + b + " = "+ sub);
        System.out.println(a + " * " + b + " = "+ mul);
        System.out.println(a + " / " + b + " = "+ div);
    }
}
