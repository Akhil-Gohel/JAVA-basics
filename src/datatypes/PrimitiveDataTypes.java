package datatypes;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
        byte => 1 byte = 8 bits (-128 to 127)
        short => 2 bytes (-32,768 to 32,767)
        char => 2 bytes [ '\u0000' (or 0) to '\uffff' (or 65,535) ]
        boolean => 1 bit
        int => 4 bytes [ -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) ]
        float => 4 bytes
        double => 8 bytes
        long => 8 bytes [ -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1) ]
         */

        byte b1 = 10;
        byte b2 = -20;
        byte b3 = -128;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println();


        short s1 = 10000;
        short s2 = -5000;
        short s3 = -32768;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println();


        int i1 = 5;
        System.out.println("i1 = " + i1);
        int i2 = 15 / 4;
        System.out.println("i2 = " + i2);
        int i3 = -2147483648;
        System.out.println("i3 = " + i3);
        System.out.println();


        long l1 = 1000000L;
        long l2 = -2000000L;
        long l3 = -9223372036854775808L;
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);
        System.out.println();


        float f1 = 5.6f;
        System.out.println("f1 = " + f1);

        float f2 = 15 / 4;  // integer division
        float f3 = 15 / 4f; // float division
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);

        float f4 = -2147483648f;
        System.out.println("f4 = " + f4);
        System.out.println();


        double d1 = 5.6;
        double d2 = 6.5d;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        double d3 = 15 / 4d;
        System.out.println("d3 = " + d3);

        double d4 = -9223372036854775808d;
        System.out.println("d4 = " + d4);
        System.out.println();


        char c1 = 'a';
        char c2 = 'Z';
        char c3 = 65;
        int A = 'A';
        int Z = 'Z';
        int a = 'a';
        int z = 'z';
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("A = " + A);
        System.out.println("Z= " + Z);
        System.out.println("a = " + a);
        System.out.println("z = " + z);
        System.out.println();


        boolean bl1 = false;
        boolean bl2 = true;
        System.out.println("bl1 = " + bl1);
        System.out.println("bl2 = " + bl2);
    }
}
