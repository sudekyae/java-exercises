import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı ve soyadınızı girin: ");
        String isim = scanner.nextLine();

        System.out.println("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Yaşadığınız şehiri girin: ");
        String sehir = scanner.nextLine();

        System.out.println("Mesleğinizi girin: ");
        String meslek = scanner.nextLine();

        System.out.println("------------------------");
        System.out.println("Ad Soyad : "+isim);
        System.out.println("Yaş : "+yas);
        System.out.println("Şehir : "+sehir);
        System.out.println("Meslek : "+meslek);
        System.out.println("------------------------");
    }
}