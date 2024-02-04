package chapter2;

public class Literaller {
    public static void main(String[] args) {
        int i = 12;
        double d = 5.0;

        byte b = 127;
        short s = 32767;

        float f = 1.0F;

        long l = 10_000_000_000L;

        d = 1.234568952348723847299534935735E200;
        System.out.println(d);

        d = 1.23456E-2;
        System.out.println(d);

        System.out.println(1 / 3);
        System.out.println(1 / 3.0);
        System.out.println(1F / 3);

        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535

    }
}
