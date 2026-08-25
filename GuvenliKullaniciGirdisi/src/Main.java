import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        while (true){
            try {

                System.out.println("Tam sayı girin: ");
                sayi = scanner.nextInt();
                break;

            }catch (InputMismatchException e){

                System.out.println("Hata: Lütfen sadece tam sayı girin!");
                scanner.nextLine(); //Hatalı girdiyi temizlemek için yazdık

            }finally {

                System.out.println("Giriş denemesi tamamlandı");

            }
        }
        System.out.println("Girdiğiniz sayı: "+sayi);
        scanner.close();
    }
}