import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi1;
        int sayi2;

        do {
            System.out.print("Başlangıç sayısı: ");
            sayi1 = scanner.nextInt();
            System.out.print("Bitiş sayısı: ");
            sayi2 = scanner.nextInt();

            if (sayi1 > sayi2) {
                System.out.println("Başlangıç değeri bitiş değerinden büyük. Lütfen tekrar giriniz!\n");
            }
        } while (sayi1 > sayi2);

        int asalAdedi = 0;
        int asalToplami = 0;

        System.out.println("\n--- Bulunan Asal Sayılar ---");

        for (int i = sayi1; i <= sayi2; i++) {

            if (i < 2) {
                continue;
            }

            boolean asalMi = true;


            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(i + " ");
                asalAdedi++;
                asalToplami += i;
            }
        }

        System.out.println("\n\n--- Asal Sayı Raporu ---");
        System.out.println("Toplam Asal Sayı Adedi: " + asalAdedi);
        System.out.println("Asal Sayıların Toplamı: " + asalToplami);

        scanner.close();
    }
}