package chapter2;

public class Test {
    public static void main(String[] args) {
        double a = 6.5;
        a += a + 1; // -> a = a + (a + 1)
        System.out.println(a);

        a = 6;
        a /= 2;
        System.out.println(a);
    }
}
