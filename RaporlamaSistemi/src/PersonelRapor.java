public class PersonelRapor extends Rapor{
    PersonelRapor(String raporBasligi, String hazirlayanKullanici, String olusturulmaTarihi) {
        super(raporBasligi, hazirlayanKullanici, olusturulmaTarihi);
    }

    @Override
    void raporOlustur() {
        System.out.println("Personel Raporu");
    }
}
