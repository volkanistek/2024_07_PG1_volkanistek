package chapter3;

public class BooleanOperatorler {
    public static void main(String[] args) {
        var age = 24;

        System.out.println(!(age > 18));

        boolean a = false;
        boolean b = false;

        System.out.println(a && (b = true));
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------");

        System.out.println((b = true) || (a = true));
        System.out.println(a);
        System.out.println(b);
    }
}
