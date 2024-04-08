package chapter4;

public class Karakterler {
    public static void main(String[] args) {
        char ch = 'A';
        ch = '\u0041';
        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println((int) 'a' + " \" \\ ");
        ch++;
        System.out.println(ch);
        System.out.println(++ch);
        System.out.println(ch++);
        System.out.println(ch);

        short s = 32767;
        s += 1;
        System.out.println(s);


        ch = (32767 * 2 + 1);
        System.out.println(ch);
        System.out.println((int) ch);
        ch++;
        System.out.println(ch);
        System.out.println((int) ch);




//        for (char c = 0; c < 66000; c++) {
//            System.out.print(c + " ");
//            if ((c + 1) % 50 == 0) {
//                System.out.println();
//            }
//        }


        System.out.println('2' + '3');
        System.out.println("1" + '2' + '3');
        System.out.println('2' + '3' + "1");

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('a'));


        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isLetter('a'));

        String str = "a";
        char cha = 'a';
        short sho = 94;

        Character c = 'd';


    }
}
