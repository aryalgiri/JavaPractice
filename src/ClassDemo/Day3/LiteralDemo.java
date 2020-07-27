package ClassDemo.Day3;

import org.w3c.dom.ls.LSOutput;

public class LiteralDemo {
    public static void main(String[] args) {
        // Literal => fixed value + data type (source code representation of data type

        // 1. Integer Literal => 345 75847 9754907504 (int)

        byte b1= 127;
        short s=32767;
        int i1= 2147483647;
        long l1= 9223372036854775807L;

        // 2. Floating Literal  => 34.45 475974.2386 (double)
        double d=23.345;
        float f=23.345F;

        //3. Boolean Literal
        boolean bb1=true;
        boolean bb2=false;

        //4. Character Literal => 'a' '1' '?'
        char c1='a';
        char c2='1';
        char c3='?';
        char c4='\u0000';
        char c5=0;
        char c6=65535;

        //5. String Literal => "Ram" "abc@edf" "123" "" " "
        String s1="Ram";
        String s2="abc@edf";
        String s3="123";
        String s4="";
        String s5=" ";

        //5. Null Literal => null
        String s7=null;

        LiteralDemo ld1=new LiteralDemo();
        LiteralDemo ld2=null;
        System.out.println(s7);





    }
}
