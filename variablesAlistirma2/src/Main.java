import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğduğunuz yılı girin: ");
        int yil = scanner.nextInt();
        int guncelYil = 2026;
        int yas = guncelYil - yil;
        int gun = yas * 365;
        int saat = gun * 24;
        int saniye = saat * 3600;

        System.out.println(yas);
        System.out.println(gun+" gün");
        System.out.println(saat+" saat");
        System.out.println(saniye+" saniye");
    }
}