//10.	Write a Program for the following Mathematical Function
// something
package Assignment;

public class Q10MathFunctions {
    public static void main(String[] args) {
        //a.
        float u=1.5f, a=9.8f;
        int t=5;
        float s= (float) (u*t+0.5*a*t*t);
        System.out.println(s);

        //b.
        s=10;
        a=2;
        int b=5,c=1;
        float area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

        //c.
        double x= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(x);

    }
}
