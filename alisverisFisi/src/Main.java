import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün: ");
        String urun = scanner.nextLine();

        System.out.println("Birim fiyat: ");
        float birimFiyat = scanner.nextFloat();

        System.out.println("Adet: ");
        int adet = scanner.nextInt();

        System.out.println("KDV: ");
        float kdv = scanner.nextFloat();

        float araToplam = birimFiyat * adet;
        float kdvTutarı = araToplam * (kdv/100);
        float toplam = araToplam + kdvTutarı;

        System.out.println("Ürün: "+urun);
        System.out.println("Birim fiyat: "+birimFiyat);
        System.out.println("Adet: "+adet);
        System.out.println("Ara toplam: "+ araToplam+ " TL");
        System.out.println("KDV: "+kdvTutarı+" TL");
        System.out.println("Toplam: "+toplam+" TL");
    }
}