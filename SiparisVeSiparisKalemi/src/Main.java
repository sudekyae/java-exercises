public class Main {
    public static void main(String[] args) {
        Siparis siparis = new Siparis();

        Siparis.SiparisKalemi kalem1 =
                siparis.new SiparisKalemi("Kalem", 5, 15.5);

        Siparis.SiparisKalemi kalem2 =
                siparis.new SiparisKalemi("Defter", 2, 40);

        siparis.kalemEkle(kalem1);
        siparis.kalemEkle(kalem2);

        siparis.siparisiListele();
    }
}