package ClassDemo.Day4;

public class TypeCastingDemo1 {
    public static void main(String[] args) {
        byte b=4;
        int i=b;    //implicit type casting: byte => short => int => long => float => double
                    // (explicit is needed for the other way round.
        System.out.println(b + " "+ i);
        System.out.println("==========");

        int ii=5;
        byte bb=(byte)ii;   //explicit type casting
        System.out.println(ii + " "+bb);
        System.out.println("---------");

        //Explicit typecasting gives the garbage value when spillage,
        //garbage value is calculated based on 2S-complement formula
        int x=200;
        byte bx=(byte)x;
        System.out.println(x + " "+bx); // 200 -56

    }
}
