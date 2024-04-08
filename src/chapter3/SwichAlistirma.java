package chapter3;

public class SwichAlistirma {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;

        switch (x + 3) {
            case 6: y = 1;
            default: y += 1;
        }
        // y -> 2

        y = 1;
        if (x == 3)
            y = -1;
        y += 1;

        // y -> 2




        y = (x > y) ? x : y;

        if (x > y) {
            y = x;
        }


    }
}
