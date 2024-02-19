package chapter2;

import java.util.Scanner;

public class BozukParaHesapla {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Kusuratli bir para giriniz: ");
        double para = klavye.nextDouble(); // 6.71

        int lira = (int) para; // 6

        int kalan = (int) (para * 100) % 100; // 0

        // 50
        int ellilik = kalan / 50; // 1
        kalan %= 50; // 20

        // 25
        int yirmibeslik = kalan / 25; // 0
        kalan %= 25; // 20

        // 10
        int onluk = kalan / 10; // 2
        kalan %= 10; // 0

        // 5
        int beslik = kalan / 5; // 0
        kalan %= 5; // 0

        // 1
        int kurus = kalan;

        System.out.println("Girdiginiz " + para + " sunlardan olusuyor:");
        System.out.println("    " + lira + " lira");
        System.out.println("    " + ellilik + " tane 50 kurus");
        System.out.println("    " + yirmibeslik + " tane 25 kurus");
        System.out.println("    " + onluk + " tane 10 kurus");
        System.out.println("    " + beslik + " tane 5 kurus");
        System.out.println("    " + kurus + " tane 1 kurus");

    }
}
