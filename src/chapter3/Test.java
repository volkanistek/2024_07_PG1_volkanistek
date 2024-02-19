package chapter3;

public class Test {
    public static void main(String[] args) {

        boolean b = 4 < 3;
        System.out.println("b: " + b);
        if (b) {
            System.out.println("Bu yaziti gormeyecegiz");
        }
        System.out.println("b: " + b);

        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 0.5);
        System.out.println(x);


//        while (true) {
//            System.out.println(System.currentTimeMillis());
//        }
    }
}
