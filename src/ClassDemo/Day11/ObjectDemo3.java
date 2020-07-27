package ClassDemo.Day11;

public class ObjectDemo3 {
    public static void main(String[] args) {
        System.out.println(new ObjectDemo3().hashCode());

        ObjectDemo3 ob1=new ObjectDemo3();
        System.out.println(ob1.hashCode());

        ObjectDemo3 ob2;
        ob2=new ObjectDemo3();
        System.out.println(ob2.hashCode());
        System.out.println(ob2);

        System.out.println("ClassDemo.Day11.ObjectDemo3@"+ Integer.toHexString(ob2.hashCode()));
    }
}
