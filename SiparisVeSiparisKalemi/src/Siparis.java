import java.util.ArrayList;

public class Siparis {

    class SiparisKalemi{
        private String urunAdi;
        private int adet;
        private double fiyat;
        double toplamFiyat = 0;

        public SiparisKalemi(String urunAdi, int adet, double fiyat){
            if(adet<=0){
                throw new IllegalArgumentException("Adet 0 veya negatif olamaz!");
            }else {
                this.adet = adet;
            }

            if(fiyat<=0){
                throw new IllegalArgumentException("Fiyat 0 veya negatif olamaz!");
            }else {
                this.fiyat = fiyat;
            }

            this.urunAdi=urunAdi;
            toplamFiyat = adet * fiyat;
        }

        void kalemiYazdir(){
            System.out.println("Ürün: "+urunAdi);
            System.out.println("Adet: "+adet);
            System.out.println("Toplam fiyat: "+toplamFiyat+" TL");
        }
    }

    //liste kısmında ai desteği alındı
    private ArrayList<SiparisKalemi> kalemler = new ArrayList<>();

    void kalemEkle(SiparisKalemi kalem) {
        kalemler.add(kalem);
    }

    double siparisToplaminiHesapla() {
        double toplam = 0;

        for (SiparisKalemi kalem : kalemler) {
            toplam += kalem.toplamFiyat;
        }

        return toplam;
    }

    void siparisiListele() {
        for (SiparisKalemi kalem : kalemler) {
            kalem.kalemiYazdir();
            System.out.println("--------");
        }

        System.out.println("Sipariş toplamı: " + siparisToplaminiHesapla() + " TL");
    }
}
