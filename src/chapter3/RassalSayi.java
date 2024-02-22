package chapter3;

public class RassalSayi {
    public static void main(String[] args) {
        int ekranaYazdirilmaSayisi = 80;

        // 0 <= y <= 1
        int baslangicSayisi = 0;
        int araliktaKacSayiVar = 2;

        for (int i = 0; i < ekranaYazdirilmaSayisi; i++) {
            int random;// = (int) (Math.random() * araliktaKacSayiVar) + baslangicSayisi;

            if (Math.random() < 0.5) {
                random = 0;
            } else {
                random = 1;
            }

            System.out.print(random);
            if ((i + 1) % 8 == 0)
                System.out.println();
        }
    }
}
