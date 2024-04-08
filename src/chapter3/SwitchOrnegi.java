package chapter3;

public class SwitchOrnegi {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 50);

        switch (random) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println(random);
        }

        if (random == 0) {
            System.out.println("0");
        } else if (random == 1) {
            System.out.println("0");
        } else if (random == 2) {
            System.out.println("0");
        } else if (random == 3) {
            System.out.println("0");
        } else if (random == 4) {
            System.out.println("0");
        } else if (random == 5) {
            System.out.println("0");
        } else  {
            System.out.println(random);
        }

        System.out.println("Program bitti...");
    }
}
