public class SatisRapor extends Rapor{
    SatisRapor(String raporBasligi, String hazirlayanKullanici, String olusturulmaTarihi) {
        super(raporBasligi, hazirlayanKullanici, olusturulmaTarihi);
    }

    @Override
    void raporOlustur() {
        System.out.println("Satış Raporu İçeriği: Bu ay toplam 500 adet ürün satıldı. Toplam ciro: 15.000 TL.");
    }
}
