package ClassDemo.Day10;

public class StaticNonStaticDemo1 {
    public void greet(){
        System.out.println("hello !");
        System.out.println("good morning");
    }
    public void printInfo(String name, long phoneNumber){
        System.out.println("Name:"+ name);
        System.out.println("Phopne:"+ phoneNumber);
    }
    public static void main(String[] args) {
        /*
        printInfo("Shyam", "985345"); // non-static methods cannot be called directly like this.
        greet();                      // static methods can be called directly or through class reference.
        */                            // non-static methods can be called only through object reference.
    }
}
