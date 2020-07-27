package ClassDemo.Day4;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // Increment/decrement operators: ++, --
        // post (a++, a--): does the operation first and increments/decrements; pre(++a, --a): increments/decrements first and does the operation

        int a=3;
        System.out.println(a);
        a++;
        System.out.println(a); //4
        ++a;
        System.out.println(a); //5
        System.out.println("============");

        int x=5;
        System.out.println(x); //5
        System.out.println(x++); //5
        System.out.println(x); //6
        System.out.println("+++++++++++");

        int i=4;
        int j=i++;
        System.out.println(i);  //5
        System.out.println(j);  //4
        System.out.println("--------");

        int m=5;
        int n=++m;
        System.out.println(m); //6
        System.out.println(n); //6
        System.out.println("+++++++++++++");

        int r=5;
        r=(r++)+(++r)+r+1;  // 5+7+7+1
        System.out.println(r); // 20




    }
}
