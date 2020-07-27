package ClassDemo.Day3;

import org.w3c.dom.ls.LSOutput;

public class DataTypeDemo {
    public static void main(String[] args) {

        byte b1=127; // max range => System.out.println(Byte.MAX_VALUE)
        byte b2= -128; // min range => System.out.println(Byte.MIN_VALUE)

        short s1=32767; // max range =>  System.out.println(Short.MAX_VALUE)
        short s2=-32767; // min range =>  System.out.println(Short.MIN_VALUE)

        int i1=2147483647; // max range => System.out.println(Integer.MAX_VALUE)
        int i2=-2147483648; // min range => System.out.println(Integer.MIN_VALUE)

        System.out.println(Integer.BYTES); // =4
        System.out.println(Integer.SIZE); // =32

        System.out.println(Long.BYTES); // =8
        System.out.println(Long.SIZE); // =64

        System.out.println(Double.BYTES); // =8
        System.out.println(Double.SIZE); // =64

        System.out.println(Character.BYTES); // =2
        System.out.println(Character.SIZE); // =16

        char c1= 65525; // max range
        char c2=0; // min range

        System.out.println(Float.BYTES); // =4
        System.out.println(Float.SIZE); // =32

    }
}
