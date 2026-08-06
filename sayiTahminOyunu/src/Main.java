import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tahmin;
        Random random = new Random();
        int sayi;
        int hak;
        boolean tekrarOyna;

        do {
            hak = 7;
            sayi = random.nextInt(100) + 1;

            int[] oncekiTahminler = new int[7];
            int tahminSayisi = 0;

            System.out.println("7 tahmin hakkınız var!");
            System.out.println("1-100 arasında sayıyı tahmin edin: ");

            do {
                do {
                    tahmin = scanner.nextInt();
                    scanner.nextLine();

                    if (tahmin <= 0 || tahmin > 100) {
                        System.out.println("1-100 arasında bir sayı girin!");
                    }
                } while (tahmin <= 0 || tahmin > 100);

                boolean dahaOnceGirildi = false;
                for (int i = 0; i < tahminSayisi; i++) {
                    if (oncekiTahminler[i] == tahmin) {
                        dahaOnceGirildi = true;
                        break;
                    }
                }

                if (dahaOnceGirildi) {
                    System.out.println("Bu sayıyı daha önce tahmin ettiniz! Hakkınız düşmedi.");
                    continue;
                }

                oncekiTahminler[tahminSayisi] = tahmin;
                tahminSayisi++;

                hak--;

                if (tahmin < sayi) {
                    if (hak > 0) {
                        System.out.println("Sayı daha büyük!");
                        System.out.println(hak + " hakkınız kaldı.");
                    }
                } else if (tahmin > sayi) {
                    if (hak > 0) {
                        System.out.println("Sayı daha küçük!");
                        System.out.println(hak + " hakkınız kaldı.");
                    }
                } else {
                    System.out.println("Tebrikler sayıyı doğru tahmin ettiniz!");
                }

            } while (tahmin != sayi && hak > 0);

            if (tahmin != sayi) {
                System.out.println("\nHakkınız kalmadı! \nDoğru sayı: " + sayi);
            }

            System.out.println("------Oyun sonu skoru------");
            System.out.println("Puanınız: " + hak * 10);
            System.out.println("Yeniden oynamak ister misiniz? (E/H)");
            String cevap = scanner.next();

            tekrarOyna = cevap.equalsIgnoreCase("E");

        } while (tekrarOyna);

        scanner.close();
    }
}