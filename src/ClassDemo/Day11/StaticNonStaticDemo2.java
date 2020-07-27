package ClassDemo.Day11;

public class StaticNonStaticDemo2 {

    // static variables are class members, non-static are object members/instance variables/attributes/data/properties
    // static variables are shared as single copy by all objects but all objects have different copies of non-static variables
    // static methods are class level behaviors; non-static methods are object-specific behaviors
    String nonStaticVar="I am non-static";
    static String staticVar="I am static";

    public static void greet(){
        System.out.println("hello !");
        System.out.println("good morning");
    }
    public void printInfo(String name, long phoneNumber){
        System.out.println("Name: "+ name);
        System.out.println("Phopne: "+ phoneNumber);
    }

    public static void main(String[] args) {
        greet(); // called directly because it's static and is called within the same class
        System.out.println("+++++++");

        StaticNonStaticDemo2.greet(); // to call outside the class, class reference is mandatory
        System.out.println(StaticNonStaticDemo2.staticVar);
        System.out.println("=========");

        StaticNonStaticDemo2 ob=new StaticNonStaticDemo2();
        ob.printInfo("Hari", 555555);
        System.out.println(ob.nonStaticVar);


    }
}
