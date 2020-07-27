package ClassDemo.Day10;

public class MethodDemo1 {
    /*Syntax:
    <access modifier> void<method name>(){
        ====;
        ====;
    }*/
    //method declaration
    //void with zero arguments
    public void greet(){
        System.out.println("hello");
        System.out.println("Good Morning");
    }
    // void with any type and any number of arguments
    public void printInfo(String name, long phoneNumber){
        System.out.println("Name: "+ name);
        System.out.println("Phone: "+ phoneNumber);
    }
    public static void main(String[] args) {
        MethodDemo1 ob=new MethodDemo1();
        // method call
        ob.greet();
        System.out.println("===========");
        ob.printInfo("Ram", 99999);
    }
}
