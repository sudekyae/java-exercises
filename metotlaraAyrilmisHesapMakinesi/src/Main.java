
public class Main {

    public static void main(String[] args) {
     bol(9,5);
     faktoriyel(3);

    }

    public static void topla(int sayi1, int sayi2){
        int sonuc = sayi1 + sayi2;
        System.out.println(sonuc);
    }

    public static void cikar(int sayi1, int sayi2){
        int sonuc = sayi1 - sayi2;
        System.out.println(sonuc);
    }

    public static void carp(int sayi1, int sayi2){
        int sonuc = sayi1 * sayi2;
        System.out.println(sonuc);
    }

    public static void bol(float sayi1, float sayi2){
        if(sayi2 == 0){
            System.out.println("Sayılar sıfıra bölünemez!");
            return;
        }

        float sonuc = sayi1/sayi2;
        System.out.println(sonuc);
    }

    public static void usAl(int sayi1, int sayi2) {
        int deger = 1;

        for (int i = 1; i <= sayi2; i++) {
            deger *= sayi1;
        }

        System.out.println(deger);
    }

    public static void faktoriyel(int sayi){
        if(sayi<0){
            System.out.println("Pozitif bir sayı girin!");
            return;
        }
        int sonuc=1;
        for(int i=1; i<=sayi; i++){
            sonuc *= i;
        }
        System.out.println(sonuc);
    }
}