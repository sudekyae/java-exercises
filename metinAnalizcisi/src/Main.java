import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Metin girin: ");
        String metin = scanner.nextLine();

        // Tüm noktalama işaretlerini silmek için yaptık.
        // [\p{Punct}] tüm noktalama işaretlerini temsil eden hazır bir kalıp
        metin = metin.replaceAll("[\\p{Punct}]", "");

        int toplamKarakter = metin.replace(" ", "").length();

        String kelimeler[] = metin.split(" ");
        int kelimeSayisi = kelimeler.length;

        int sesliHarfSayisi = 0;
        char karakterler[] = {'a', 'e', 'u', 'ü', 'o', 'ö', 'i', 'ı'};

        String kucukMetin = metin.toLowerCase();

        for(int i=0; i<kucukMetin.length(); i++){
            char karakter = kucukMetin.charAt(i);
            for(int j=0; j<karakterler.length;j++){
                if(karakter == karakterler[j]){
                    sesliHarfSayisi++;
                }
            }
        }

        String enUzunKelime = kelimeler[0];

        for(int i=0; i<kelimeler.length; i++){
            if(kelimeler[i].length() > enUzunKelime.length()){
                enUzunKelime = kelimeler[i];
            }
        }

        String tersMetin = "";

        for(int i=metin.length()-1; i>=0; i--){
            tersMetin+=metin.charAt(i);
        }

        //String tersMetin = new StringBuilder(metin).reverse().toString();
        // javada .reverse tersten yazmak için kullanılır
        //StringBuilder sb = new StringBuilder("Kelebek");
        //sb.reverse(); // "kebeleK" olur
        //.toString yapılan değişiklikler bittiğinde yeniden standart string değişkene kaydetmek için kullanılır

        System.out.println("------Metin Analiz Sonuçları------");
        System.out.println("Toplam karakter sayısı: " +toplamKarakter);
        System.out.println("Sesli harf sayısı: " +sesliHarfSayisi);
        System.out.println("En uzun kelime: " +enUzunKelime);
        System.out.println("Metinin tersi: " +tersMetin);
    }
}