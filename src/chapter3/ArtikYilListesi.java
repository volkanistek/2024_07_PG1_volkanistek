package chapter3;

public class ArtikYilListesi {
    public static void main(String[] args) {
        for (int year = 1800; year <= 2200; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}
