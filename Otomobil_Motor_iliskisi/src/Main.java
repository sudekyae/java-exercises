public class Main {
    public static void main(String[] args) {
        Otomobil otomobil1 = new Otomobil();
        otomobil1.otomobilDurumunuGoster();
        System.out.println("--------");
        otomobil1.otomobiliCalistir();
        otomobil1.hizlan();
        otomobil1.otomobilDurumunuGoster();
        System.out.println("--------");
        otomobil1.otomobiliArizalandir();
        otomobil1.otomobilDurumunuGoster();
        System.out.println("--------");
        otomobil1.otomobiliDurdur();
        otomobil1.hizlan();
        otomobil1.otomobilDurumunuGoster();
    }
}