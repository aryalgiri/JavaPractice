package ClassDemo.Day11;

public class ObjectDemo2 {
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println(new ObjectDemo2()); // creates an anonymous object (in heap memory) with default values for instance variables
                            // (name and age) after creating an object id

        ObjectDemo2 ob1=new ObjectDemo2(); // in this case the object id is assigned to ob1 after creating an object
        System.out.println(ob1);

        ObjectDemo2 ob2;      // ob2 is created, the object id is created and initialized , and then object id is assigned to ob2
        ob2=new ObjectDemo2();
        System.out.println(ob2);
    }
}
