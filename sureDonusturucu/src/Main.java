import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saniye;

        do {
            System.out.println("Toplam saniyeyi girin: ");
            saniye = scanner.nextInt();

            if (saniye < 0) {
                System.out.println("Geçerli bir süre girin!");
            }
        } while (saniye < 0);

        // Hesaplamalar (int / int sonucu tam sayı verir)
        int saat = saniye / 3600;
        saniye = saniye % 3600; // Mod operatörü (%) eklendi

        int dakika = saniye / 60;
        saniye = saniye % 60;   // Kalan saniye

        System.out.println(saat +" saat " +dakika +" dakika " +saniye +" saniye");

        scanner.close();
    }
}