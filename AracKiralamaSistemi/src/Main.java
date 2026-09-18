public class Main {
    public static void main(String[] args) {

        Otomobil otomobil = new Otomobil("34 AB 345", "Citroen", 3, 35);
        otomobil.toplamUcretHesapla();
        otomobil.bilgiGoster();

        System.out.println("\n");

        Motosiklet motosiklet = new Motosiklet("35 CD 567", "Yamaha", 15, 40);
        motosiklet.toplamUcretHesapla();
        motosiklet.bilgiGoster();

        System.out.println("\n");

        Kamyonet kamyonet = new Kamyonet("36 ADC 234", "Ford", 2, 50);
        kamyonet.toplamUcretHesapla();
        kamyonet.bilgiGoster();
    }
}