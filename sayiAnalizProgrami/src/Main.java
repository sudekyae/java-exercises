import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı: ");
        int sayi = scanner.nextInt();

        int sayac = sayi;

        int tersSayi = 0;
        int basamakSayisi = 0;
        int basamakToplami = 0;
        boolean palindrom = true;
        int[] rakamSayilari = new int[10];

        while (sayac > 0) {
            int a = sayac % 10;
            rakamSayilari[a]++;
            basamakToplami += a;
            basamakSayisi++;
            tersSayi = (tersSayi * 10) + a;
            sayac /= 10;
        }

        System.out.println("Sayı: "+sayi);
        System.out.println("Basamak sayısı: "+basamakSayisi);
        System.out.println("Basamak toplamı: "+basamakToplami);
        System.out.println("Tersi: "+tersSayi);
        System.out.println("Palindrom: " + (sayi == tersSayi ? "Evet" : "Hayır"));

        System.out.println("Rakamların sayıları: ");
        for(int i=0; i<10; i++)
        {
            if(rakamSayilari[i] > 0)
            {
                System.out.println(i+ " rakamından "+rakamSayilari[i] +" tane var.");
            }
        }


    }
}