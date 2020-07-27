package ClassDemo.Day10;

public class MethodDemo2 {
    // Method declaration with return type
    public String greet(){
        return "Hello, good morning!";
    }
    public int findMax(int a,int b){
        int max;
        if (a>b){
            max=a;
        } else{
            max=b;
        }
        return max;
    }
    public static void main(String[] args) {
        MethodDemo2 ob=new MethodDemo2();
        ob.greet(); // doesn't work
        System.out.println("----------");
        String s=ob.greet();
        System.out.println(s);
        System.out.println("===========");
        System.out.println(ob.greet());
        System.out.println("+++++++++++");
        ob.findMax(55,3); // doesn't work
        System.out.println("==========");
        System.out.println("max:"+ ob.findMax(55,3));

    }
}
