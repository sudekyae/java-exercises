import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("7 tahmin hakkınız var!");
        System.out.println("1-100 arasında sayıyı tahmin edin: ");

        int tahmin = scanner.nextInt();
        if(tahmin<=0 || tahmin >100){
            do {
                System.out.println("1-100 arasında bir sayı girin!");
            }while(tahmin<100 && tahmin>0);
        }


        Random random = new Random();
        int sayi = random.nextInt();
        int hak = 7;

        do{

        }while(tahmin!=sayi);
    }
}