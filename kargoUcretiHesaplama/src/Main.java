import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kargoUcreti;
        double tutar;
        int mesafe;

        do {
            System.out.println("Sipariş tutarı: ");
             tutar = scanner.nextDouble();

        }while(tutar<=0);

        do {
            System.out.println("Teslimat mesafesi: ");
            mesafe = scanner.nextInt();

        }while(mesafe<=0);

        System.out.println("Premium üye misiniz?(true/false) ");
        boolean premium = scanner.nextBoolean();

        if(tutar>=1000)
        {
            System.out.println("Kargo ücretsiz");
            return;
        }

        if (mesafe <= 50) {
            kargoUcreti = 50;
        }
        else if (mesafe <= 150) {
            kargoUcreti = 90;
        }
        else {
            kargoUcreti = 150;
        }

        if (premium) {
            kargoUcreti *= 0.5;
        }

        System.out.println("Kargo ücretiniz: " + kargoUcreti + " TL");

    }
}