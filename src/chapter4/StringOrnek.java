package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringOrnek {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

//        String inp1 = keyboard.next();
//        System.out.println(inp1);
//
//        String inp2 = keyboard.next();
//        System.out.println(inp2);
//
//        String inp3 = keyboard.next();
//        System.out.println(inp3);

        String s1 = "Enter ";
        String s2 = "a string: ";

        System.out.print("Enter " + "a string: ");
        String input = "Java"; //keyboard.nextLine();
        System.out.println("input: " + input);

        System.out.println("input.length(): " + input.length());

        System.out.println("input.charAt(2): " + input.charAt(2));

        String upperCase = input.toUpperCase();

        System.out.println("input: " + input);

        System.out.println("input(upperCase): " + upperCase);

        System.out.println("input(lowerCase): " + input.toLowerCase());

        String str = " \t- Merhaba - ";
        System.out.println("str: " + str.trim());




    }
}
