//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] notlar = {42, 85, 67, 93, 58, 74, 31, 88, 100, 52};

        int enYuksekNot = 0;
        int enDusukNot = 1000;
        double toplamNot = 0;
        int ortalamaUstundekiOgrenciSayisi = 0;
        int gecenOgrenciSayisi = 0;
        int kalanOgrenciSayisi = 0;
        int gecmeNotu = 50;
        double ortalama = 0;


        for(int i=0; i<notlar.length; i++){

            toplamNot += notlar[i];

            if(notlar[i] > enYuksekNot)
            {
                enYuksekNot = notlar[i];
            }

            if(notlar[i]<enDusukNot)
            {
                enDusukNot = notlar[i];
            }

            if(notlar[i]<gecmeNotu)
            {
                kalanOgrenciSayisi++;
            } else {
                gecenOgrenciSayisi++;
            }
        }

        ortalama = toplamNot/10;

        for(int i = 0; i<notlar.length; i++){
            if (notlar[i]>ortalama) {
                ortalamaUstundekiOgrenciSayisi++;
            }
        }

        System.out.println("-----Sınıf Bilgileri-----");
        System.out.println("Ortalama: "+ortalama);
        System.out.println("En yüksek not: "+enYuksekNot);
        System.out.println("En düşük not: "+enDusukNot);
        System.out.println("Ortalamanın üzerindeki öğrenci sayısı: "+ortalamaUstundekiOgrenciSayisi);
        System.out.println("Geçen öğrenci sayısı: "+gecenOgrenciSayisi);
        System.out.println("Kalan öğrenci sayısı: "+kalanOgrenciSayisi);

    }
}