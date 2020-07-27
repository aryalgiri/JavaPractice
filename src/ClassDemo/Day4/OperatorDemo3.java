package ClassDemo.Day4;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //Logical Operator: &&, ||, !
        // They are also called short circuit operators because the compiler moves to the
        //next condition only when the first condition is met (or is true)
        System.out.println(true && true); // true
        System.out.println(true&&false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); //false

        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        System.out.println(!true); //false
        System.out.println(!false); // true
    }
}
