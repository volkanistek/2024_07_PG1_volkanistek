package chapter4;

import java.util.Scanner;

public class StringOrnek2 {
    public static void main(String[] args) {

        System.out.println("Ankara".equalsIgnoreCase("ankara"));

        System.out.println("ankara".compareTo("Ankara"));

        System.out.println("Antalya".endsWith("talya"));
        System.out.println("Antalya".contains("an"));

        System.out.println("Antalya".substring(5));
        System.out.println("Antalya".substring(2, 5));



    }
}
