public class StokRapor extends Rapor{
    StokRapor(String raporBasligi, String hazirlayanKullanici, String olusturulmaTarihi) {
        super(raporBasligi, hazirlayanKullanici, olusturulmaTarihi);
    }

    @Override
    void raporOlustur() {
        System.out.println("Stok Raparu: Aylık stok miktarı 500 adet.");
    }
}
