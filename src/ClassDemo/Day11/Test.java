package ClassDemo.Day11;

public class Test {
    // static variables are class members, non-static are object members/instance variables/attributes/data/properties
    // static variables are shared as single copy by all objects but all objects have different copies of non-static variables
    public static void main(String[] args) {
        StaticNonStaticDemo2 ob=new StaticNonStaticDemo2();
        ob.printInfo("Shiva", 23456);
        System.out.println(ob.nonStaticVar);
        System.out.println("==========");

        /*greet();                  // do not work because called directly outside their class
        System.out.println(staticVar);*/
        StaticNonStaticDemo2.greet();
        System.out.println(StaticNonStaticDemo2.staticVar);
    }
}
